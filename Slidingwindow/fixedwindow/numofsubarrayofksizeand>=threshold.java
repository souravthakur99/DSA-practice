class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        //
        if(arr.length<k) return -1;
        //first valid window
        long sum=0;
        long size=k;
        int count=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if((int)(sum/size)>=threshold){
            count++;
        }
        //next windows
        for(int i=k;i<arr.length;i++){
            sum=sum+arr[i]-arr[i-k];
            if((int)(sum/size)>=threshold) count++;
        }
        return count;
    }
}
