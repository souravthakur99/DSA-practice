class Solution {
    public int longestSubarray(int[] nums) {
        int l=0;
        int count=0;
        int maxl=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
            //window shrink jab count>1
            
            while(count>1){
                if(nums[l]==0){
                    count--;
                }
                l++;
                
            }
            maxl=Math.max(maxl,i-l+1);

        }
        return maxl-1;
    }
}
