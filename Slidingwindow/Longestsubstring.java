class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>(256);
        int n=s.length();
        int l=0;int r=0;
        int maxlen=0;
        while(r<n){
        if(map.containsKey(s.charAt(r))){
            l = Math.max(l,map.get(s.charAt(r)) + 1);
        }   
        map.put(s.charAt(r),r);
        maxlen=Math.max(maxlen,r-l+1); 
        r=r+1;
        }
        return maxlen;

    }
}
//longest substring without repeating characters
