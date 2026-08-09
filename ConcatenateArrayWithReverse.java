public class ConcatenateArrayWithReverse {
    public int[] concatWithReverse(int[] nums) {
        int[] ans = new int[nums.length * 2];

        int left = 0;
        int right = ans.length - 1;

        while (left < nums.length) {
            ans[left] = nums[left];
            ans[right] = nums[left];

            left++;
            right--;
        }
        return ans;
    }
}
