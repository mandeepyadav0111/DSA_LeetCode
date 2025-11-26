class Solution {
    public int deleteAndEarn(int[] nums) {
       if (nums.length == 0) return 0;

        // Find the maximum value to size the array
        int max = 0;
        for (int num : nums) {
            if (num > max) max = num;
        }

        // points[v] = total points we get by taking all instances of v
        int[] points = new int[max + 1];
        for (int num : nums) {
            points[num] += num;
        }
        
        int dp []=new int [max+1];
        dp[0]=0;
        if (max >= 1) dp[1] = Math.max(points[0], points[1]);

        for(int i=2; i <= max; i++){
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + points[i]);

        }
        
        return dp[max];
    }
}