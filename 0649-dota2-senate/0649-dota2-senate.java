class Solution {
    public String predictPartyVictory(String senate) {
        int n=senate.length();
        Queue<Integer> Radiant=new LinkedList<>();
        Queue<Integer> Dire=new LinkedList<>();
        // store the index of R and D in different Queues
        for(int i=0; i<n;i++){
            char ch=senate.charAt(i);
            if(ch=='R'){
                Radiant.add(i);
            }
            else{
                Dire.add(i);
            }
        }
        //while any one of queue !=empty
        //whose front(index) is smaller remove from Front and push to Last FRONT+N
        //and whose larger remove permanent
        while(!Radiant.isEmpty() && !Dire.isEmpty()){
            int rIndex=Radiant.peek();
            int dIndex=Dire.peek();
            if(rIndex < dIndex){
                Radiant.add(Radiant.remove()+n);
                Dire.remove();
            }
            else{
                Dire.add(Dire.remove()+n);
                Radiant.remove();
            }
        }
        return !Radiant.isEmpty() ? "Radiant" :"Dire" ;
        
    }
}