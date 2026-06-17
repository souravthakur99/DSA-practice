class Solution {
    public char processStr(String s, long k) {

        int n=s.length();

        long[] len=new long[n];

        long curr=0;

        for(int i=0;i<n;i++){

            char c=s.charAt(i);

            if(c>='a' && c<='z'){
                curr++;
            }
            else if(c=='*'){
                if(curr>0)
                    curr--;
            }
            else if(c=='#'){
                curr*=2;
            }

            len[i]=curr;
        }


        if(k>=len[n-1])
            return '.';


        for(int i=n-1;i>=0;i--){

            char c=s.charAt(i);

            if(c>='a' && c<='z'){

                if(k==len[i]-1)
                    return c;
            }

            else if(c=='*'){

                len[i]++;

            }

            else if(c=='#'){

                long half=len[i]/2;

                if(k>=half)
                    k-=half;
            }

            else if(c=='%'){

                k=len[i]-1-k;

            }
        }

        return '.';
    }
}
