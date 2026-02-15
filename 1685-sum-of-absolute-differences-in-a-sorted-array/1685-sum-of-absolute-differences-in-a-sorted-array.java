class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n= nums.length;
        int result [] = new int [n];
        
        int presum [] = new int [n];
        int pre=0;
        for(int i=0; i<n; i++){
            pre += nums[i];
            presum[i] = pre;
        }

        for (int i=0; i<n; i++){
            int left = Math.abs((i+1)*nums[i] - presum[i]);
            int right= Math.abs((n-1-i)*nums[i] - (presum[n-1] - presum[i]));
            result[i] =  left + right; 
        }
        return result;

    }
}