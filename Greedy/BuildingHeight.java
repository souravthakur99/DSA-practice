import java.util.*;

class Solution {
    public int maxBuilding(int n, int[][] restrictions) {

        List<int[]> list = new ArrayList<>();

        // building 1 height is 0
        list.add(new int[]{1,0});

        for(int[] r : restrictions){
            list.add(r);
        }

        // add building n
        list.add(new int[]{n, n-1});


        // sort by index
        list.sort((a,b)->a[0]-b[0]);


        // First pass: make restrictions valid from left
        for(int i=1;i<list.size();i++){

            int dist = list.get(i)[0] - list.get(i-1)[0];

            list.get(i)[1] = Math.min(
                list.get(i)[1],
                list.get(i-1)[1] + dist
            );
        }


        int ans = 0;


        // Second pass: find maximum peak
        for(int i=list.size()-1;i>0;i--){

            int pos1 = list.get(i-1)[0];
            int h1 = list.get(i-1)[1];

            int pos2 = list.get(i)[0];
            int h2 = list.get(i)[1];


            int dist = pos2 - pos1;


            // maximum height between them
            int peak = (h1 + h2 + dist) / 2;


            ans = Math.max(ans, peak);


            // fix right side
            list.get(i-1)[1] =
                Math.min(
                    list.get(i-1)[1],
                    h2 + dist
                );
        }


        return ans;
    }
}
