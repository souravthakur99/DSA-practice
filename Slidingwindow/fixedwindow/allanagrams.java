class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(s.length() < p.length()) {
    return new ArrayList<>();
}
        int k=p.length();
        ArrayList<Integer>list=new ArrayList<>();
        HashMap<Character,Integer>map1=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();
        for(int i=0;i<k;i++){
            //fixed window mein frequency dhundo
            char ch=p.charAt(i);
            
                map1.put(ch,map1.getOrDefault(ch,0)+1);
            
            char ch1=s.charAt(i);
            
                map2.put(ch1,map2.getOrDefault(ch1,0)+1);
            
        }
        if(map1.equals(map2)){
            list.add(0);
        }
        //abb variable size 
        for(int i=k;i<s.length();i++){
            char ch=s.charAt(i); //incoming
            if(map2.containsKey(ch)){
                map2.put(ch,map2.get(ch)+1);
            }
            else{
                map2.put(ch,1);
            }
            char ch1=s.charAt(i-k);//outgoing element
           
                map2.put(ch1,map2.get(ch1)-1);
                if(map2.get(ch1)==0){
                    map2.remove(ch1);
                }

            if(map1.equals(map2)){
                list.add(i-k+1);//new window starting point
            }
        }
    return list;
    }
}
