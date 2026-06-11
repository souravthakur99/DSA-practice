class Solution {
    static final int MOD = 1_000_000_007;

    public int assignEdgeWeights(int[][] edges) {
        int n = edges.length + 1;

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) adj.add(new ArrayList<>());

        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[n + 1];

        q.add(1);
        vis[1] = true;

        int depth = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            depth++;

            for (int i = 0; i < size; i++) {
                int node = q.poll();

                for (int nei : adj.get(node)) {
                    if (!vis[nei]) {
                        vis[nei] = true;
                        q.add(nei);
                    }
                }
            }
        }

        int edgesOnPath = depth - 1;

        // if only root or invalid
        if (edgesOnPath <= 0) return 0;

        return (int) modPow(2, edgesOnPath - 1);
    }

    private long modPow(long base, int exp) {
        long res = 1;
        long mod = MOD;

        while (exp > 0) {
            if ((exp & 1) == 1) res = (res * base) % mod;
            base = (base * base) % mod;
            exp >>= 1;
        }

        return res;
    }
}
