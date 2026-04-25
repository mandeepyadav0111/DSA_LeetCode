class Solution {
    public int search(int[] nums, int target) {
        int n= nums.length;
        int left=0;
        int right= n-1;
        while(left <= right){
            int mid= (left + right)/2;
            if(nums[mid] == target) return mid;
            

            if(target <= nums[mid] && target >= nums[left]){
                right=mid-1;
            }
            else{
                left= mid+1;
            }
        }
       return -1; 
    }
}