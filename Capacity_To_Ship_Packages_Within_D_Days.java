public class Capacity_To_Ship_Packages_Within_D_Days {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;

        for (int weight : weights) {
            left = Math.max(left, weight);
            right += weight;
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (daycount(days, weights, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean daycount(int days, int[] weight, int cap) {
        int day = 1;
        int currload = 0;

        for (int weights : weight) {
            if (currload + weights > cap) {
                day++;
                currload = weights;
            } else {
                currload += weights;
            }
        }
        return days >= day;
    }
}
