class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
     if ((long) m * k > bloomDay.length)

            return -1;
     
    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
    for(int day:bloomDay){
        min=Math.min(min,day);
        max=Math.max(max,day);
    }
    while(min<=max){
    int mid=min+(max-min)/2;
    if(possible(mid,bloomDay,m,k)){
        max=mid-1;
    }
    else{
        min=mid+1;
    }
    
    }
    return min;
}
   
     public boolean possible(int mid,int[]bloomDay,int m,int k){
        int boq=0;
         int count=0;
        for(int i=0;i<bloomDay.length;i++){
           
            
            if(bloomDay[i]<=mid){
                count++;
                if(count==k) {boq++;
                count=0;}
            }
            else{count=0;}
        }
        if(boq>=m) return true;
        return false;
     }
}
