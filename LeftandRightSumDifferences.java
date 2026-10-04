public class LeftandRightSumDifferences {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        int totalsum = 0;

        for (int num : nums) {
            totalsum += num;
        }
        int leftsum = 0;

        for (int i = 0; i < n; i++) {
            int rightsum = totalsum - leftsum - nums[i];

            answer[i] = Math.abs(leftsum - rightsum);

            leftsum += nums[i];
        }
        return answer;
    }
}
