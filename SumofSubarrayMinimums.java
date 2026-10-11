public class SumofSubarrayMinimums {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int mod = 1_000_000_007;
        int[] stack = new int[n + 1];
        int top = -1;
        long result = 0;

        for (int i = 0; i <= n; i++) {
            int cur = (i == n) ? Integer.MIN_VALUE : arr[i];
            while (top >= 0 && arr[stack[top]] >= cur) {
                int mid = stack[top--];
                int leftBound = (top >= 0) ? stack[top] : -1;
                long left = mid - leftBound;
                long right = i - mid;
                result = (result + arr[mid] * left % mod * right) % mod;
            }
            stack[++top] = i;
        }
        return (int) result;
    }
}
