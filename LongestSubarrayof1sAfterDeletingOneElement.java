public class LongestSubarrayof1sAfterDeletingOneElement {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int zeroMark = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] == 0) {
                zeroMark++;
            }

            while (zeroMark > 1) {
                if (nums[left] == 0) {
                    zeroMark--;
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left);
        }
        return maxLen;
    }
}
