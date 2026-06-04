class Solution {

    public int getWaviness(int num) {
        
        String s = String.valueOf(num);
        
        if(s.length() < 3)
            return 0;
        
        int count = 0;
        
        for(int i = 1; i < s.length() - 1; i++) {
            
            // peak
            if(s.charAt(i) > s.charAt(i-1) &&
               s.charAt(i) > s.charAt(i+1)) {
                count++;
            }
            
            // valley
            else if(s.charAt(i) < s.charAt(i-1) &&
                    s.charAt(i) < s.charAt(i+1)) {
                count++;
            }
        }
        
        return count;
    }


    public int totalWaviness(int num1, int num2) {
        
        int ans = 0;
        
        for(int i = num1; i <= num2; i++) {
            ans += getWaviness(i);
        }
        
        return ans;
    }
}
