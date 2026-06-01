public class Minimum_Size_Subarray_Sum {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int minsub = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                minsub = Math.min(minsub, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return minsub == Integer.MAX_VALUE ? 0 : minsub;
    }
}
