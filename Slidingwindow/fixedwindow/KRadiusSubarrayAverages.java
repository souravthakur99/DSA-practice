class Solution {
    public int[] getAverages(int[] nums, int k) {
        int[]avg=new int[nums.length];
        long sum=0;
        Arrays.fill(avg,-1);
        long windowsize=2*k+1;
        if(windowsize>nums.length){
            return avg;
        }
        
        //abb window1 dekho pehli
        for(int i=0;i<2*k+1;i++){
            sum+=nums[i];
        }
        //pehla avg is at k index only
        avg[k]=(int)(sum/windowsize);
        //abb next window shuru hogi k+1 aur khtm hogi last valid index i<=length-k-1
        for(int i=k+1;i<=nums.length-1-k;i++){
            //outgoing i-k-1 incoming i+k
            sum=sum-nums[i-k-1]+nums[i+k];
            avg[i]=(int)(sum/windowsize);
        }
        return avg;

        }
    }
//lc 2090
