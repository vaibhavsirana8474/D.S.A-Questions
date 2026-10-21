class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length==0) return new int[0];
        int m=mat.length;
        int n=mat[0].length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int key=i+j;
                map.putIfAbsent(key, new ArrayList());
                map.get(key).add(mat[i][j]);
            }
        }

        List<Integer> ans=new ArrayList<>();
        boolean flip=true;
        for(int i=0;i<=m+n-2;i++){
            List<Integer> diagonal=map.get(i);
            if(flip){
                Collections.reverse(diagonal);
            }
            ans.addAll(diagonal);
            flip=!flip;
        }

        int[] arr = new int[ans.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=ans.get(i);
        }
        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna