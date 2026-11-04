import java.util.*;

class Solution {
    public long minOperations(int[] nums, int x, int k) {
        int n = nums.length;
        long[] windowCost = new long[n - x + 1];
        
        // Two multisets using TreeMap to handle duplicates efficiently
        TreeMap<Integer, Integer> lower = new TreeMap<>();
        TreeMap<Integer, Integer> upper = new TreeMap<>();
        int lowerSize = 0, upperSize = 0;
        long lowerSum = 0, upperSum = 0;

        for (int i = 0; i < n; i++) {
            // Add element
            if (lowerSize == 0 || nums[i] <= lower.lastKey()) {
                lower.put(nums[i], lower.getOrDefault(nums[i], 0) + 1);
                lowerSum += nums[i];
                lowerSize++;
            } else {
                upper.put(nums[i], upper.getOrDefault(nums[i], 0) + 1);
                upperSum += nums[i];
                upperSize++;
            }

            // Remove element falling out of window
            if (i >= x) {
                int out = nums[i - x];
                if (lower.containsKey(out)) {
                    removeOne(lower, out);
                    lowerSum -= out;
                    lowerSize--;
                } else {
                    removeOne(upper, out);
                    upperSum -= out;
                    upperSize--;
                }
            }

            // Balance sizes: lower should hold (x + 1) / 2 elements
            int targetLower = (x + 1) / 2;
            while (lowerSize > targetLower) {
                int maxLower = lower.lastKey();
                removeOne(lower, maxLower);
                lowerSum -= maxLower;
                lowerSize--;

                upper.put(maxLower, upper.getOrDefault(maxLower, 0) + 1);
                upperSum += maxLower;
                upperSize++;
            }

            while (lowerSize < targetLower && upperSize > 0) {
                int minUpper = upper.firstKey();
                removeOne(upper, minUpper);
                upperSum -= minUpper;
                upperSize--;

                lower.put(minUpper, lower.getOrDefault(minUpper, 0) + 1);
                lowerSum += minUpper;
                lowerSize++;
            }

            // Record window cost once window size x is reached
            if (i >= x - 1) {
                long median = lower.lastKey();
                long cost = (median * lowerSize - lowerSum) + (upperSum - median * upperSize);
                windowCost[i - x + 1] = cost;
            }
        }

        // DP state space optimization: DP[i][j] -> DP[j]
        long INF = (long) 1e18;
        long[][] dp = new long[n + 1][k + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], INF);
            dp[i][0] = 0;
        }

        for (int j = 1; j <= k; j++) {
            for (int i = x; i <= n; i++) {
                dp[i][j] = dp[i - 1][j];
                if (dp[i - x][j - 1] != INF) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - x][j - 1] + windowCost[i - x]);
                }
            }
        }

        return dp[n][k];
    }

    private void removeOne(TreeMap<Integer, Integer> map, int key) {
        int count = map.get(key);
        if (count == 1) {
            map.remove(key);
        } else {
            map.put(key, count - 1);
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna