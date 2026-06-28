class Solution {
    public int[] rearrangeArray(int[] nums) {
        // int lc=0;
        // int rc=0;
        // int l=0;
        // int r=0;
        // int count=0;
        // int[]ans=new int[nums.length];
        // while(count<nums.length){
            
        //     if(lc>rc){
        //         if(nums[r]>0&&r<nums.length)r++;
        //         else{
        //             ans[count]=nums[r];
        //             r++;
        //             rc++;
        //             count++;
        //         }
        //     }
        //     else if(lc<rc){
        //         if(nums[l]<0&&l<nums.length)l++;
        //         else{
        //             ans[count]=nums[l];
        //             l++;
        //             lc++;
        //             count++;
        //         }
        //     }
        //     else{
        //         //positive add kara
        //         if(lc==rc&&nums[l]>0){
        //         ans[count]=nums[l];
        //         lc++;
        //         count++;
        //         l++;
        //         }
        //         else{
        //             l++;
        //         }
        //     }
        // }
        // return ans;
        int[]ans=new int[nums.length];
        int pos=0;
        int neg=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){ans[pos]=nums[i];
            pos+=2;
            }
            else{
                ans[neg]=nums[i];
                neg+=2;
            }
        }
        return ans;
    }
}
