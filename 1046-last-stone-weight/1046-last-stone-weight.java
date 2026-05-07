class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q= new PriorityQueue<>((a,b)->b-a);
        for(int stone: stones){
            q.add(stone);
        }
        while(!q.isEmpty()){
            int y= q.poll();
            if(!q.isEmpty()){
                int x= q.poll();
                if(y-x >0) q.add(y-x);
            }
            else{
                return y;
            }
        }
        return 0;
    }
}