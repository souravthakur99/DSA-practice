class Solution {
    int[] maxTree, minTree;
    int n;

    public long maxTotalValue(int[] nums, int k) {
        n = nums.length;

        build(nums);

        PriorityQueue<long[]> pq =
            new PriorityQueue<>((a,b)->Long.compare(b[0],a[0]));

        // best r for every l
        for(int l=0;l<n;l++){
            pq.add(new long[]{value(l,n-1), l, n-1});
        }

        long ans = 0;

        while(k-- > 0){
            long[] cur = pq.poll();

            long val = cur[0];
            int l = (int)cur[1];
            int r = (int)cur[2];

            ans += val;

            if(r > l){
                pq.add(new long[]{
                    value(l,r-1),
                    l,
                    r-1
                });
            }
        }

        return ans;
    }


    long value(int l,int r){
        return queryMax(l,r)-queryMin(l,r);
    }


    void build(int[] nums){
        maxTree = new int[4*n];
        minTree = new int[4*n];
        build(1,0,n-1,nums);
    }


    void build(int idx,int l,int r,int[] nums){

        if(l==r){
            maxTree[idx]=nums[l];
            minTree[idx]=nums[l];
            return;
        }

        int mid=(l+r)/2;

        build(idx*2,l,mid,nums);
        build(idx*2+1,mid+1,r,nums);

        maxTree[idx]=Math.max(
            maxTree[idx*2],
            maxTree[idx*2+1]
        );

        minTree[idx]=Math.min(
            minTree[idx*2],
            minTree[idx*2+1]
        );
    }


    int queryMax(int idx,int l,int r,int ql,int qr){
        if(qr<l || r<ql) return Integer.MIN_VALUE;

        if(ql<=l && r<=qr)
            return maxTree[idx];

        int mid=(l+r)/2;

        return Math.max(
            queryMax(idx*2,l,mid,ql,qr),
            queryMax(idx*2+1,mid+1,r,ql,qr)
        );
    }


    int queryMin(int idx,int l,int r,int ql,int qr){
        if(qr<l || r<ql) return Integer.MAX_VALUE;

        if(ql<=l && r<=qr)
            return minTree[idx];

        int mid=(l+r)/2;

        return Math.min(
            queryMin(idx*2,l,mid,ql,qr),
            queryMin(idx*2+1,mid+1,r,ql,qr)
        );
    }


    int queryMax(int l,int r){
        return queryMax(1,0,n-1,l,r);
    }

    int queryMin(int l,int r){
        return queryMin(1,0,n-1,l,r);
    }
}
