class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int l=0;
        Deque<Integer>maxdq=new ArrayDeque<>();
        int[]ans=new int[nums.length+1-k];
        //pehli fixed window
        int r=k-1;
        for(int i=0;i<k;i++){
            //iska. max find karoo
            while(!maxdq.isEmpty()&&nums[maxdq.peekLast()]<nums[i]){
                maxdq.removeLast();
            }
            maxdq.addLast(i);
        }
        int maxfirst=nums[maxdq.peekFirst()];
        int p=0;
        ans[p]=maxfirst;
        p++;

       
        for(int i=k;i<nums.length;i++){
            //abb incoming aurr outgoing logic
            //1 outgoing element kyaa woo dq mein bhe hai aurr kyaa woo dq mein valid window ka part hao i-k+1 window starting
            while(!maxdq.isEmpty()&& maxdq.peekFirst()<i-k+1){
                //matlab window kee bahar hai
                maxdq.removeFirst();
            }
            //abb incoming dekho
            //incoming see choote el remove kardo dq see
            while(!maxdq.isEmpty()&&nums[i]>nums[maxdq.peekLast()]){
                maxdq.removeLast();
            }
            maxdq.addLast(i);
            ans[p]=nums[maxdq.peekFirst()];
            p++;
            

        }
        return ans;

    }
}
