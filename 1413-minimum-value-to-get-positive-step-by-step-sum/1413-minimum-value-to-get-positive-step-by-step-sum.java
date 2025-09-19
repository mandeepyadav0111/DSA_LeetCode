class Solution {
    public int minStartValue(int[] nums) {
        int presum=0;
        int min=0;
        for(int i=0; i< nums.length; i++){
            presum += nums[i];
            min= Math.min(min, presum);
        }
        return Math.abs(min)+1;
    }
}