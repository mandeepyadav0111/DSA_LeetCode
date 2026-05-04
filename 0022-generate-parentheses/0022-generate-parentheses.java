class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans= new ArrayList<>();
        backtrack(ans, new StringBuilder(),0,0,n);
        return ans; 
    }
    public static void backtrack(List<String> list,StringBuilder sb, int open, int close,int n){
        if(sb.length()==n*2){
            list.add(sb.toString());
            return;
        }
        if(open<n){
            sb.append('(');
            backtrack(list, sb, open+1, close, n);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open){
            sb.append(')');
            backtrack(list, sb, open, close+1, n);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}