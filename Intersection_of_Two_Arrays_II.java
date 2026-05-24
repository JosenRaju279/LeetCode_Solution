import java.util.*;

public class Intersection_of_Two_Arrays_II {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> counts = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        for (int num : nums1) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            if (counts.getOrDefault(num, 0) > 0) {
                result.add(num);
                counts.put(num, counts.get(num) - 1);
            }
        }

        int[] intersect = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            intersect[i] = result.get(i);
        }

        return intersect;
    }
}
