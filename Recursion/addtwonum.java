class Solution {
    public int addDigits(int num) {
       int sum=0;
       int n=num;
       if(num<10) return num;
       while(n>0){
        sum+=n%10;
        n/=10;
       }
       return addDigits(sum);
}
}
