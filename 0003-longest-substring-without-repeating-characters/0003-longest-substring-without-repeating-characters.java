class Solution {
    public int lengthOfLongestSubstring(String s) {
        int [] flag=new int [255];
        int maxlength=0;
        int si=0;
        int ei=0;
        while (ei < s.length()) {
            int idx = s.charAt(ei);
            while (flag[idx] == 1) {
                flag[s.charAt(si)] = 0;
                si++;
            }
            flag[idx] = 1;
            maxlength = Math.max(maxlength, ei - si + 1);
            ei++;
        }
        return maxlength;
    }
}