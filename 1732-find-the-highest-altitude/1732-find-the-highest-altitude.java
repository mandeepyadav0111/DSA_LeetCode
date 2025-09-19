class Solution {
    public int largestAltitude(int[] gain) {
        int presum=0;
        int highest= 0;
        for(int i=0; i< gain.length; i++){
            presum +=gain[i];
            highest= Math.max(highest, presum);
        }
        return highest;
    }
}