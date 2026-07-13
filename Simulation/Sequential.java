class Solution {
    // public boolean seq(String s){
        
    //     for(int i=0;i<s.length()-1;i++){
    //         if(s.charAt(i+1)!=s.charAt(i)+1){
    //             return false;
    //         }
    //     }
    // return true;
    // }
    public List<Integer> sequentialDigits(int low, int high) {
         ArrayList<Integer>list=new ArrayList<>();
        
        // for(int i=start;i<high+1;i++){
        // String s=String.valueOf(i);
        // if(seq(s)){
            
        //     list.add(i);
        // }
        // }
        for(int i=1;i<=9;i++){
            int num=i;
            for(int next=i+1;next<=9;next++){
                num=num*10+next;
                if(num>=low&&num<=high){
                    list.add(num);
                }
            } 
        }
       
    
    Collections.sort(list);
    return list;
    }
}
