class Solution {
    public int minimumCost(int[] cost) {
      Arrays.sort(cost);  
      int pay=0;
      int i=cost.length-1;
      while(i>=0){
        pay+=cost[i];
        i--;
        if(i>=0){pay+=cost[i];
        i--;}
        if(i>=0){
            i--;
        }
      }
      return pay;
    }
}
