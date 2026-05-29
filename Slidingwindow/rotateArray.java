class Solution {
    public void rotate(int[] nums, int k) {
        //reverse the full array
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        //reverse the first k
        reverse(nums,0,k-1);
        //reverse the elements after k
        reverse(nums,k,n-1);

    }
    private void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
