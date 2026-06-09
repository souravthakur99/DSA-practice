class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
     for(int num:nums){
        max=Math.max(max,num);
        min=Math.min(min,num);
     }
     long sum=max-min;
     return k*sum;
    }
}
