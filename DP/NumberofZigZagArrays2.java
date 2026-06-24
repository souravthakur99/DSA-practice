class Solution {

    static final long MOD = 1_000_000_007L;

    long[][] multiply(long[][] A, long[][] B) {
        int n = A.length;
        long[][] C = new long[n][n];

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                if (A[i][k] == 0) continue;

                for (int j = 0; j < n; j++) {
                    if (B[k][j] == 0) continue;

                    C[i][j] =
                        (C[i][j] + A[i][k] * B[k][j]) % MOD;
                }
            }
        }
        return C;
    }

    long[][] power(long[][] M, long p) {
        int n = M.length;

        long[][] res = new long[n][n];

        for (int i = 0; i < n; i++) {
            res[i][i] = 1;
        }

        while (p > 0) {
            if ((p & 1) == 1) {
                res = multiply(res, M);
            }

            M = multiply(M, M);
            p >>= 1;
        }

        return res;
    }

    public int zigZagArrays(int n, int l, int r) {

        int m = r - l + 1;
        int sz = 2 * m;

        long[][] T = new long[sz][sz];

        for (int x = 0; x < m; x++) {

            for (int y = 0; y < x; y++) {
                T[x][m + y] = 1;
            }

            for (int y = x + 1; y < m; y++) {
                T[m + x][y] = 1;
            }
        }

        // build length-2 state
        long[] init = new long[sz];

        for (int a = 0; a < m; a++) {
            for (int b = 0; b < m; b++) {

                if (a < b) init[b]++;
                else if (a > b) init[m + b]++;
            }
        }

        long[][] P = power(T, n - 2);

        long ans = 0;

        for (int i = 0; i < sz; i++) {
            long cur = 0;

            for (int j = 0; j < sz; j++) {
                cur = (cur + P[i][j] * init[j]) % MOD;
            }

            ans = (ans + cur) % MOD;
        }

        return (int) ans;
    }
}
