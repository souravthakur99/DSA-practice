class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int l=0;
        int r=0;
        int maxl=0;
        Deque<Integer>mindq=new ArrayDeque<>();
        Deque<Integer>maxdq=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
            //min aurr max dq maintain karooo
            while(!maxdq.isEmpty()&&nums[maxdq.peekLast()]<nums[i]){
                maxdq.removeLast();
            }
            maxdq.addLast(i);

            while(!mindq.isEmpty()&&nums[mindq.peekLast()]>nums[i]){
                mindq.removeLast();
            }
            mindq.addLast(i);

           
            while( nums[maxdq.peekFirst()]-nums[mindq.peekFirst()]>limit){
                //window invalid haii 
                l++;
                if(!maxdq.isEmpty()&&maxdq.peekFirst()<l){
                    //agar pehlaa index jo hai woo chotaa hao l++ see too invalid hai remove karo
                        maxdq.removeFirst();
                }
                if(!mindq.isEmpty()&&mindq.peekFirst()<l){
                    mindq.removeFirst();
                }
            }
            maxl=Math.max(maxl,i-l+1);
        }
        return maxl;
    }
}
