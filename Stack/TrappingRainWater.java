class Solution {
    public int trap(int[] height) {
       int[]lm=new int[height.length];
       int maxl=Integer.MIN_VALUE;
       for(int i=0;i<height.length;i++){
        if(i==0){maxl=height[0];
        lm[i]=maxl;}
        else{
            maxl=Math.max(maxl,height[i]);
            lm[i]=maxl;
        }
       
    }
    int[]rm=new int[height.length];
    int maxr=Integer.MAX_VALUE;
    for(int i=height.length-1;i>=0;i--){
        if(i==height.length-1){
            maxr=height[i];
            rm[i]=height[i];
        }
        else{
            maxr=Math.max(maxr,height[i]);
            rm[i]=maxr;
        }
    }
    int mv=Integer.MAX_VALUE;
    int count=0;
    for(int i=0;i<height.length;i++){
        mv=Math.min(lm[i],rm[i]);
        count=count+(mv-height[i]);
    } 
    return count;
    }
}
