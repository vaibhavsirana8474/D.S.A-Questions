class Solution {
    public int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int i = 0;
        int j=height.length-1;
        while(i<j){
            int lh = height[i];
            int rh = height[j];
            int h = Math.min(lh,rh);
            maxArea = Math.max(maxArea,h*(j-i));
            if(lh<rh){
                i++;
            } else{
                j--;
            }
        }
        return maxArea;
    }
}