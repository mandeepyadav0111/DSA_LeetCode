class Twitter {
   static int timeStamp = 0;

    private class User{
        int userId;
        Set<Integer> followed;
        Tweet tweetHead;

        User(int userId){
            this.userId= userId;
            followed= new HashSet<>();
            follow(userId);   //must folow themself
            tweetHead= null;
        }
        public void follow(int id){
             followed.add(id);
        }

        public void unfollow(int id){
            if(id!= this.userId){
               followed.remove(id);
            }
        }
        public void post(int id){
            Tweet newTweet= new Tweet(id);
            newTweet.next= tweetHead;
            tweetHead= newTweet;
        }
    }
    

    private class Tweet{
        int tweetId;
        int time;
        Tweet next;
        Tweet(int id){
            this.tweetId= id;
            time= timeStamp++;
            next= null;
        }
    }

  private Map<Integer, User> userMap;
    public Twitter() {
        userMap= new HashMap<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        if(!userMap.containsKey(userId)){
            User newUser= new User(userId);
            userMap.put(userId, newUser);
        }
        userMap.get(userId).post(tweetId);
    }
    
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> newsFeed= new ArrayList<>();
        if(!userMap.containsKey(userId)){
            return newsFeed;
        }
        Set<Integer> follower= userMap.get(userId).followed;
        PriorityQueue<Tweet> tweetHeap= new PriorityQueue<>(follower.size(), (a,b)-> b.time-a.time);
        for(int user: follower){
            Tweet tweet= userMap.get(user).tweetHead;
            if(tweet != null){
                tweetHeap.add(tweet);
            }
        }
        int count=0;
        while(count < 10 && !tweetHeap.isEmpty()){
            Tweet curr = tweetHeap.poll();
            newsFeed.add(curr.tweetId);

            if(curr.next != null){
                tweetHeap.add(curr.next);
            }
            count++;
        }
        return newsFeed; 
    }
    
    public void follow(int followerId, int followeeId) {
        if(!userMap.containsKey(followerId)){
            User newUser= new User(followerId);
            userMap.put(followerId, newUser);
        }
        if(!userMap.containsKey(followeeId)){
            User newUser= new User(followeeId);
            userMap.put(followeeId, newUser);
        }
        userMap.get(followerId).follow(followeeId);
        
    }
    
    public void unfollow(int followerId, int followeeId) {
        if(userMap.containsKey(followerId) && followerId!= followeeId){
            userMap.get(followerId).unfollow(followeeId);
        }
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */