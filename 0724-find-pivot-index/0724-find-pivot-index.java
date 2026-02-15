class Solution {
    public int pivotIndex(int[] nums) {
        int n= nums.length;

        int presum [] = new int [n];
        presum[0]= nums[0];

        for(int i=1; i<n; i++){
            presum[i] = presum[i-1]+ nums[i];
        }
        if(presum[n-1]-presum[0]==0){
            return 0;
        }
        for(int i=1; i<n; i++){
            if(presum[i-1] == presum[n-1]-presum[i]){
                return i;
            }
        }
        return -1;  
    }
}