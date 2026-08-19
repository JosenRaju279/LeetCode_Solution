import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int prefixsum = 0;
        int count = 0;

        for (int num : nums) {
            prefixsum += num;

            count += map.getOrDefault(prefixsum - k, 0);
            map.put(prefixsum, map.getOrDefault(prefixsum, 0) + 1);
        }
        return count;
    }
}
