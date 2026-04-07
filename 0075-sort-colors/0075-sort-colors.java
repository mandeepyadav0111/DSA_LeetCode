class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int pointer=0;
        while(pointer<=j){
        if(nums[pointer]==0){
           int temp=nums[pointer];
           nums[pointer]=nums[i];
           nums[i]=temp;
           pointer++;
           i++;
        }
        else if(nums[pointer]==2){
          int temp=nums[pointer];
           nums[pointer]=nums[j];
           nums[j]=temp;
         
          j--;
        }
        else{
            pointer++;
        }
    }
    }
   
}