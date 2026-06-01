class Solution {
    public void sortColors(int[] nums) {
            int r=nums.length-1; 
            int l=0;
            int mid=(r+l)/2;
            while(l<r){
                if(nums[l]>nums[r]){
                    int temp=nums[l];
                    nums[l]=nums[r];
                    nums[r]=temp;
                }
                l++;
                r--;
            } 

    }             
}
