class Solution {
    public int maxArea(int[] height) {
        int totalwater=0;
        int lp=0;
        int rp=height.length-1;

        while(lp<rp){
            int h=Math.min(height[lp],height[rp]);
            int width=rp-lp;
            int currwater= width*h;
            totalwater=Math.max(totalwater,currwater);

            if(height[lp]<height[rp]){
                lp++;
            }
            else{
                rp--;
            }
        }
        return totalwater;
        
    }
}