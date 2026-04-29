class Solution {
    public boolean caneat(int [] piles,int h,int mid){
       int hour=0;
       for(int i=0;i<piles.length;i++){
        if (piles[i]%mid==0){
            hour+=piles[i]/mid;
        }
        else{
            hour+=(piles[i]/mid)+1;
        }
        if(hour>h){
            return false;
        }
       }
       return true;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int ans=0;
        int  s=1;
        int e=0;
        int n=piles.length;
        for(int i=0; i<n;i++){
           e=Math.max(e,piles[i]);
        }
        while(s<=e){
           int mid=(s+e)/2;
           if(caneat(piles,h,mid)){
            ans=mid;
            e=mid-1;
           }
           else{
            s=mid+1;
           }
        }
      return ans;
    }
}