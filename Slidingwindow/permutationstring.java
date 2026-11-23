class Solution {
    public boolean checkInclusion(String s1, String s2) {
      int k=s1.length();
      if(s2.length()<s1.length()) return false; //edge case
      HashMap<Character,Integer>map=new HashMap<>();
      for(int i=0;i<s1.length();i++){
        //check freq of each char in s1
        char ch=s1.charAt(i);
        if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
        }
        else{
            map.put(ch,1);
        }
      } 
      // ekk fixed window loo pehlee
      HashMap<Character,Integer>map2=new HashMap<>();
      int l=0;
      for(int i=0;i<k;i++){
        //uss window mein check karo freq of each
    char ch=s2.charAt(i);
        if(map2.containsKey(ch)){
            map2.put(ch,map2.get(ch)+1);
        }
        else{
            map2.put(ch,1);
        }
        //abb check bhee karoo map1aur map2 equal hai
        if(map2.equals(map)) return true;
      }
      //abb baki window check karoo
      for(int i=k;i<s2.length();i++){
        //outgoing remove incoming addd
        char ch=s2.charAt(i-k);
        map2.put(ch,map2.get(ch)-1);
        if(map2.get(ch)==0){
            map2.remove(ch);
        }
        //incoming
        char ch2=s2.charAt(i);
        if(map2.containsKey(ch2)){
            map2.put(ch2,map2.get(ch2)+1);
        }
        else{
            map2.put(ch2,1);
        }
        //abb yahan check kar map1 euals map2
        if(map2.equals(map)) return true;
      }
      return false;
    }
}
