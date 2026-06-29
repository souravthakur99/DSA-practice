class Solution {
    public List<String> buildArray(int[] target, int n) {
        int curr=1;
        List<String>ans=new ArrayList<>();
       for(int i=0;i<target.length;i++){
        while(curr<target[i]){
            ans.add("Push");
            ans.add("Pop");      
            curr++;  
            }
            ans.add("Push");
            curr++;

       }
       
return ans;
        }
        
}
