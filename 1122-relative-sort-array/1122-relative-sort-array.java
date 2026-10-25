class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> l = new ArrayList<>();
        List<Integer> m = new ArrayList<>();
        Arrays.sort(arr1);

        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    l.add(arr1[j]);
                    arr1[j]=-1;
                }
            }
        }

        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=-1){
                m.add(arr1[i]);
            }
        }

        int[] ans = new int[l.size()+m.size()];
        for(int i=0;i<l.size();i++){
            ans[i]=l.get(i);
        }

        int p=0;
        for(int i=l.size();i<l.size()+m.size();i++){
            ans[i]=m.get(p);
            p++;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna