class Solution {
    public int reverse(int x) {
        double rev = 0;
        int xp=0;
        boolean isNegative= false;
        if(x < 0) {
            x= -x;
            isNegative= true;
        }

        while(x > 0){
            rev = 10 * rev +(x % 10);
            x= x/10;
            xp++;
        }

        if(isNegative == true){
            rev= -rev;
        }
        int min=Integer.MIN_VALUE;
        int max= Integer.MAX_VALUE;

        if(min < rev && rev < max) return (int)rev;
        else return 0;  
    }
}