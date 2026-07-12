public class MinimumOperationstoMakeArraySumDivisiblebyK {
    public int minOperations(int[] nums, int k) {
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return (int) (sum % k);
    }
}
