class Solution {
    public int findMin(int[] nums) {
        int n= nums.length;
        if(n==1) return nums[0];
        int small= nums[0];
        int left=0;
        int right= n-1;
        while(left <= right){
            if(nums[left] < nums[right]){
                small= Math.min(small, nums[left]);
            }
            int mid= (right+left)/2;
            small= Math.min(small, nums[mid]);
            if(nums[left] < nums[mid]){
                left= mid+1;
            }else{
                right= mid-1;
            }
        }
        return small;

        
    }
}