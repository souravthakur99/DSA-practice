class Solution {
    public int[] leftRightDifference(int[] nums) {
       int []ls=new int[nums.length];
       int []rs=new int[nums.length];
       for(int i=0;i<nums.length;i++){
        if(i==0)ls[i]=0;
        else{
            ls[i]=ls[i-1]+nums[i-1];
        }
       } 
        for(int i=nums.length-1;i>=0;i--){
        if(i==nums.length-1)rs[i]=0;
        else{
            rs[i]=rs[i+1]+nums[i+1];
        }

       } 
       for(int i=0;i<nums.length;i++){
        ls[i]=Math.abs(ls[i]-rs[i]);
       }
       return ls;
    }
}
