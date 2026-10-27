class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        int size=0;
        int maxlength=0;
        for(int i=0;i<nums.size();i++){
            for(int j=0;j<nums.get(i).size();j++){
                int diag=i+j;
                map.putIfAbsent(diag,new ArrayList<>());
                map.get(diag).add((nums.get(i).get(j)));
                size++;
                maxlength=Math.max(maxlength,diag);
            }
        }

        int[] ans = new int[size];
        int idx=0;
        for(int i=0;i<=maxlength;i++){
            List<Integer> temp=map.get(i);
            if(temp==null) continue;
            for(int j=temp.size()-1;j>=0;j--){
                ans[idx++]=temp.get(j);
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna