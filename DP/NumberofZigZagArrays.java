class Solution {
    public int zigZagArrays(int n, int l, int r) {

        final long MOD = 1000000007;

        int size = r + 2;

        long[] up = new long[size];
        long[] down = new long[size];


        // length 2 initialization
        for(int i = l; i <= r; i++){
            for(int j = l; j <= r; j++){

                if(i < j)
                    up[j]++;

                else if(i > j)
                    down[j]++;
            }
        }


        // build length 3 -> n
        for(int len = 3; len <= n; len++){

            long[] newUp = new long[size];
            long[] newDown = new long[size];


            // prefix of down
            long[] prefDown = new long[size];

            for(int i=l;i<=r;i++){
                prefDown[i] = down[i];
                if(i>l)
                    prefDown[i] += prefDown[i-1];

                prefDown[i] %= MOD;
            }


            // suffix of up
            long[] suffUp = new long[size];

            for(int i=r;i>=l;i--){

                suffUp[i] = up[i];

                if(i<r)
                    suffUp[i] += suffUp[i+1];

                suffUp[i] %= MOD;
            }



            for(int x=l;x<=r;x++){

                // next move must increase
                if(x > l)
                    newUp[x] = prefDown[x-1];


                // next move must decrease
                if(x < r)
                    newDown[x] = suffUp[x+1];

            }


            up = newUp;
            down = newDown;
        }


        long ans = 0;

        for(int i=l;i<=r;i++){
            ans += up[i] + down[i];
            ans %= MOD;
        }

        return (int)ans;
    }
}
