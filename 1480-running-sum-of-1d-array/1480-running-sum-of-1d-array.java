class Solution {
    public int[] runningSum(int[] nums) {
        int preSum= 0;
        int n=nums.length;
        int result [] = new int[n];
        for(int i=0; i< n; i++){
            preSum +=nums[i];
            result[i]= preSum;
        }
        return result;
    }
}