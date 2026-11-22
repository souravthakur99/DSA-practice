class Solution {
    public int totalFruit(int[] nums) {
    int distinctcount=0;
    int l=0;
    int maxl=Integer.MIN_VALUE;
    HashMap<Integer,Integer>map=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        //fruits add
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
    
    while(map.size()>2){
        map.put(nums[l],map.get(nums[l])-1);
        if(map.get(nums[l])==0){
            map.remove(nums[l]);
        }
        l++;
    }
    maxl=Math.max(maxl,i-l+1);
    }
    return maxl;
    }
}
