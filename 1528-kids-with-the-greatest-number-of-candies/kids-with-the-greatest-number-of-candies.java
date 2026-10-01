import java.util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int ele: candies){
            max=Math.max(max,ele);
        }

        for(int i=0;i<candies.length;i++){
            if((candies[i]+extraCandies)>=max){
                ans.add(true);
            } else{
                ans.add(false);
            }
        }
        return ans;
    }
}