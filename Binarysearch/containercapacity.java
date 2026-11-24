
class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int l = 0;
        int r = 0;

        // Binary search range
        for (int i : weights) {
            l = Math.max(l, i);
            r += i;
        }

        while (l < r) {

            int mid = l + (r - l) / 2;

            int requiredDays = 1;
            int sum = 0;

            // Check how many days are required
            for (int i : weights) {

                if (sum + i > mid) {
                    requiredDays++;
                    sum = i;
                } else {
                    sum += i;
                }
            }

            // Binary search
            if (requiredDays > days) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        return l;
    }
}
