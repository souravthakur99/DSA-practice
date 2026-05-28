class Solution {
    public String reverseStr(String s, int k) {
        char[]c=s.toCharArray();
        int n=c.length;
        for(int i=0;i<n;i+=2*k){
            int left=i;
            int right=Math.min(i+k-1,n-1);
            reverse(c,left,right);
        }
        return new String(c);
    }
    private void reverse(char[]a,int left,int right){
        while(left<right){
            char temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
    }
}
