class Solution {
    public boolean isBalanced(String num) {
        int esum=0;
        int osum=0;
        for(int i=0;i<num.length();i++){
            if(i%2==0){
                esum+=num.charAt(i)-'0';
            }

            else{
                osum+=num.charAt(i)-'0';
            }
        }
        if(esum==osum) return true;
        else return false;
    }
}
