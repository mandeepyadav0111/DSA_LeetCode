class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxlength = 0;
        int si = 0, ei = 0;
        
        while (ei < s.length()) {
            char ch = s.charAt(ei);
            if (!set.contains(ch)) {
                set.add(ch);
                maxlength = Math.max(maxlength, ei - si + 1);
                ei++;
            } else {
                set.remove(s.charAt(si));
                si++;
            }
        }
        return maxlength;
    }
}