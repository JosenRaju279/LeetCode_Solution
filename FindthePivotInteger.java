public class FindthePivotInteger {
    public int pivotInteger(int n) {
        int totalSum = n * (n + 1) / 2;

        int prefixSum = 0;

        for (int x = 1; x <= n; x++) {
            prefixSum += x;

            if (prefixSum == totalSum - prefixSum + x) {
                return x;
            }
        }

        return -1;
    }
}
