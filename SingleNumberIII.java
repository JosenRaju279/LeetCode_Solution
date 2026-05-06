public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        int xor = 0;

        for (int num : nums) {
            xor ^= num;
        }

        int diff = xor & (-xor);

        int x = 0;
        int y = 0;

        for (int num : nums) {
            if ((num & diff) == 0) {
                x ^= num;
            } else {
                y ^= num;
            }
        }
        return new int[] { x, y };
    }
}
