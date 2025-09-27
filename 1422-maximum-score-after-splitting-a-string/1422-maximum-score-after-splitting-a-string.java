class Solution {
    public int maxScore(String s) {
        int n= s.length();
        int score =0;
        for(int i=0; i<n; i++){
            int zeroCount=0;
            int oneCount=0;
            for(int j=0; j<= i; j++){
                if(s.charAt(j) == '0') zeroCount++;
            }
            for(int k=i+1; k<n; k++){
               if(s.charAt(k) == '1') oneCount++;
            }
            score= Math.max(score, zeroCount+oneCount);
        }
        return score;
    }
}