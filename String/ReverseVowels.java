class Solution {
    private boolean isVowel(char ch){
            ch=Character.toLowerCase(ch);
            return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
        }
    public String reverseVowels(String s) {
        int left=0;
        int right=s.length();
        char[]arr=s.toCharArray();
   
        while(left<right){
            if(!isVowel(arr[left])){left++;}
            else if(!isVowel(arr[right])){right--;}
            else{
                char temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }


        }
         
        return new String(arr);
        
    }
}
