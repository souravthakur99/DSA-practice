class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int rsum=0;
        int lsum=0;
        int sum=0;
    
        for(int i=0;i<=k-1;i++){
            lsum=lsum+cardPoints[i];
            sum=lsum;
        }
        int rind=cardPoints.length-1;
        for(int j=k-1;j>=0;j--){
            lsum=lsum-cardPoints[j];
            rsum=rsum+cardPoints[rind];
           
            sum=Math.max(sum,lsum+rsum);
             rind=rind-1;
        }
        return sum;
    }
}
