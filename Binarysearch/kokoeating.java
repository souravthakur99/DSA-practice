class Solution {
    public int minEatingSpeed(int[] piles, int h) {
    int l=1;
    int r=0;
    int h1=0;
    for(int i:piles){
        r=Math.max(r,i);
    }
    while(l<r){
        int mid=l+(r-l)/2;
        h1=0;
        for(int i:piles){
            h1+=Math.ceil((double)i/mid);
        }
        if(h1<=h){
            //aurr choti value aa sakti hai
            r=mid;
        }
        else{
            l=mid+1;
        }
    }
    return l;
    
    }
}
