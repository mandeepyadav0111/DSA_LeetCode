class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int n= nums.size();

        int seqBreaks = 0;
        int lastBreakIndex=-1;

        for(int i=0; i<n-1; i++){
            if(nums.get(i) > nums.get(i+1)){
                seqBreaks +=1;
                lastBreakIndex = i+1;
            }
        } 

        if(seqBreaks == 0) return 0;
        if(seqBreaks > 1) return -1;

        if (nums.get(n - 1) > nums.get(0)) return -1;
        return n-lastBreakIndex ; 
    }
}