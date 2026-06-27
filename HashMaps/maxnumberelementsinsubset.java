import java.util.*;

class Solution {
    public int maximumLength(int[] nums) {

        HashMap<Long, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            map.put((long) num, map.getOrDefault((long) num, 0) + 1);
        }

        int ans = 1;

        // Handle 1 separately
        if (map.containsKey(1L)) {
            int freq = map.get(1L);

            if (freq % 2 == 0)
                ans = Math.max(ans, freq - 1);
            else
                ans = Math.max(ans, freq);
        }

        // Try every other number as starting point
        for (long x : map.keySet()) {

            if (x == 1)
                continue;

            long cur = x;
            int len = 0;

            while (map.getOrDefault(cur, 0) >= 2) {
                len += 2;
                cur = cur * cur;
            }

            if (map.getOrDefault(cur, 0) == 1) {
                len += 1;
            } else {
                len -= 1;
            }

            ans = Math.max(ans, len);
        }

        return ans;
    }
}
