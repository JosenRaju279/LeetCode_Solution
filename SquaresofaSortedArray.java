public class SquaresofaSortedArray {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = nums.length - 1;

        for (int i = n - 1; i >= 0; i--) {
            int leftSqu = nums[left] * nums[left];
            int rigthSqu = nums[right] * nums[right];

            if (leftSqu > rigthSqu) {
                result[i] = leftSqu;
                left++;
            } else {
                result[i] = rigthSqu;
                right--;
            }
        }
        return result;
    }
}