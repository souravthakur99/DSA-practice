class Solution {

    public void rotateLeft(int[] nums, int k) {

        int n = nums.length;

        k = k % n;

        // reverse first k
        reverse(nums, 0, k - 1);

        // reverse remaining
        reverse(nums, k, n - 1);

        // reverse full array
        reverse(nums, 0, n - 1);
    }

    private void reverse(int[] arr, int start, int end) {

        while(start < end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
