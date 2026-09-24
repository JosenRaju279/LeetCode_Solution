public class BeautifulArrangement {
    public int countArrangement(int n) {
        boolean[] used = new boolean[n + 1];
        return backtrack(1, n, used);
    }

    private int backtrack(int position, int n, boolean[] used) {
        if (position > n) {
            return 1;
        }

        int count = 0;

        for (int i = 1; i <= n; i++) {

            if (used[i]) {
                continue;
            }

            if (i % position == 0 || position % i == 0) {

                used[i] = true;

                count += backtrack(position + 1, n, used);

                used[i] = false;
            }
        }
        return count;
    }
}
