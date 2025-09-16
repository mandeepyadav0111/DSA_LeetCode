class Solution {
    public boolean isPalindrome(int x) {
        int ans = 0;
        int initial_x=x;
        if(x<0){
            return false;
        }
        if (x==0){
            return true;
        }
        while(x!=0){
          int rem = x%10;
          x=x/10;
          ans=ans*10+rem;
        }
        return ans==initial_x;
    }
 

    }
