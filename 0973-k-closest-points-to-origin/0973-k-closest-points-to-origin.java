class Solution {
    public int[][] kClosest(int[][] points, int k) { 
        int [][] ans= new int [k][2];
        PriorityQueue<int []> q= new PriorityQueue<>((a,b)->Integer.compare( b[0]*b[0]+b[1]*b[1] , a[0]*a[0]+a[1]*a[1]));
        for(int [] point : points){
             q.add(point);
            if(q.size()>k){
                q.poll();
            }
        }
        for(int i=0; i<k; i++){
            ans[i]= q.poll();
        }
        return ans;        
    }
}