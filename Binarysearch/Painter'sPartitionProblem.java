class Solution {
    public int minTime(int[] arr, int k) {
        int l=Integer.MIN_VALUE;
        int r=0;
        
        for(int i:arr){
            r+=i;
            l=Math.max(i,l);
        }
        while(l<r){
            int time=l+(r-l)/2;
            //abb boards check karo
            int painters=1;
            int sum=0;
            for(int i=0;i<arr.length;i++){
                if(sum+arr[i]>time){
                    sum=arr[i];
                    painters++;
                }
                
                else{
                    sum+=arr[i];
                }
            }
            if(painters>k){
                //time jyada loo
                l=time+1;
            }
            else {
                //ekk chooota time try karoo
                r=time;
            }
        }
        return l;
    }
}
