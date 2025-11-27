class Solution {
    public int findKOr(int[] nums, int k) {
        int bitArray [] = new int [32];

        for(int bit=0; bit< 32; bit++){
            int count= 0;

            for(int num: nums){
                if(((num >> bit) & 1) ==1){
                    count += 1;
                }
            }
            bitArray[bit]= count;
        }

        int ans=0;
        for(int i=0 ; i< 32; i++){
            if(bitArray[i] >= k){
                ans += Math.pow(2, i); //ans |= (1 << i);
            }
        }

        return ans;
        
    }
}