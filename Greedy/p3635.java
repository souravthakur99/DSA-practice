class Solution {
    public int earliestFinishTime(
        int[] landStartTime,
        int[] landDuration,
        int[] waterStartTime,
        int[] waterDuration
    ) {

        int ans = Integer.MAX_VALUE;


        // Land -> Water
        int minLandFinish = Integer.MAX_VALUE;

        for(int i=0;i<landStartTime.length;i++){
            minLandFinish = Math.min(
                minLandFinish,
                landStartTime[i] + landDuration[i]
            );
        }

        for(int j=0;j<waterStartTime.length;j++){

            int start = Math.max(
                minLandFinish,
                waterStartTime[j]
            );

            ans = Math.min(
                ans,
                start + waterDuration[j]
            );
        }



        // Water -> Land
        int minWaterFinish = Integer.MAX_VALUE;

        for(int i=0;i<waterStartTime.length;i++){
            minWaterFinish = Math.min(
                minWaterFinish,
                waterStartTime[i] + waterDuration[i]
            );
        }


        for(int j=0;j<landStartTime.length;j++){

            int start = Math.max(
                minWaterFinish,
                landStartTime[j]
            );

            ans = Math.min(
                ans,
                start + landDuration[j]
            );
        }


        return ans;
    }
}
