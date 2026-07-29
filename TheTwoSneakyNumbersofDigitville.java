public class TheTwoSneakyNumbersofDigitville {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length - 2;
        int[] freq = new int[n];
        int[] ans = new int[2];
        int idx = 0;

        for (int num : nums) {
            freq[num]++;
            if (freq[num] == 2) {
                ans[idx++] = num;
            }
        }

        return ans;
    }
}
