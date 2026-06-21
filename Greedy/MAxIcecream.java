class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int count=0;
        int sum=coins;
        Arrays.sort(costs);
        for(int i=0;i<costs.length;i++){
            if(costs[i]>coins) break;
            else{
                sum-=costs[i];
                count++;
            }
        }
        return count;
    }
}
