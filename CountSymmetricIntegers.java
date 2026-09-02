class CountSymmetricIntegers {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        for (int x = low; x <= high; x++) {
            String s = String.valueOf(x);

            // Odd number of digits can never be symmetric
            if (s.length() % 2 != 0) {
                continue;
            }

            int n = s.length() / 2;
            int leftSum = 0;
            int rightSum = 0;

            for (int i = 0; i < n; i++) {
                leftSum += s.charAt(i) - '0';
                rightSum += s.charAt(i + n) - '0';
            }

            if (leftSum == rightSum) {
                count++;
            }
        }

        return count;
    }
}