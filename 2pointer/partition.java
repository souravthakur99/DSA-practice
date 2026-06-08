class Solution {
    public int[] pivotArray(int[] nums, int k) {
        List<Integer> less=new ArrayList<>();
        List<Integer> equal=new ArrayList<>();
        List<Integer> great=new ArrayList<>();
        for(int num:nums){
            if(num<k)less.add(num);
            else if(num==k)equal.add(num);
            else great.add(num);
        }
        int[]result=new int[nums.length];
        int id=0;
        for(int i:less) result[id++]=i;
        for(int i:equal) result[id++]=i;
        for(int i:great) result[id++]=i;
        return result;
    }
}
