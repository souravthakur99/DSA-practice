class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
       int[]nums=new int[n+m];
       int i=0;int j=0;
       int p=0;
       while(i<m && j<n){
        if(nums1[i]<nums2[j]){nums[p]=nums1[i];
        i++;
        p++;}
        else if(nums2[j]<nums1[i]){
            nums[p]=nums2[j];
            j++;
            p++;
        }
        else{
            nums[p]=nums1[i];
            i++;
            p++;
        }
       }
       //if something left in i
       while(i<m){
        nums[p]=nums1[i];
        p++;
        i++;
       }
       //if something left in j
       while(j<n){
        nums[p]=nums2[j];
        p++;
        j++;
       }
       for(int z=0;z<nums.length;z++){
        nums1[z]=nums[z];
       }
    }
}
