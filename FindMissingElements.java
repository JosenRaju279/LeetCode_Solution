import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindMissingElements {
    public List<Integer> findMissingElements(int[] nums) {

    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();

        int min = nums[0], max = nums[0];

        for (int num : nums) {
            set.add(num);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        for (int i = min; i < max; i++) {
            if (!set.contains(i)) {
                ans.add(i);
            }
        }
        return ans;
    }
}
