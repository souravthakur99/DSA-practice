class Solution {
    public int maxVowels(String s, int k) {
       // window size valid
       if(k>s.length()) return -1;
       // first valid window
       int count=0;
       for(int i=0;i<k;i++) {
        char ch=s.charAt(i);
        //check vowel
        if(ch=='a'||ch=='e'||ch=='o'||ch=='u'||ch=='i'){
            count++;
        }
        
       }
       int maxcount=count;
       //windoe slide and incoming outgoing
       for(int i=k;i<s.length();i++){
        char ch=s.charAt(i-k) ;
        //outgoing element check if vowel then count--
        if(ch=='a'||ch=='e'||ch=='o'||ch=='u'||ch=='i'){
            count--;
        }
        char ch2=s.charAt(i);
        //incoming check if vowel count++
        if(ch2=='a'||ch2=='e'||ch2=='o'||ch2=='u'||ch2=='i'){
            count++;
        }
        maxcount=Math.max(count,maxcount);

       }
       return maxcount;

    }
}
