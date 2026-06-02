class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            for(int j=0;j<waterStartTime.length;j++){
                int landtime=landStartTime[i]+landDuration[i];
                int waterstart=Math.max(landtime,waterStartTime[j]);
                ans=Math.min(ans,waterstart+waterDuration[j]);


                int watertime=waterStartTime[j]+waterDuration[j];
                int landstart=Math.max(watertime,landStartTime[i]);
                ans=Math.min(ans,landstart+landDuration[i]);
            }
        }
        return ans;

    }
}
