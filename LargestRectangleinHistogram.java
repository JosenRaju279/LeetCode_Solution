import java.util.ArrayDeque;
import java.util.Deque;

public class LargestRectangleinHistogram {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stack = new ArrayDeque<>();
        int areaMax = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            int cur = (i == n) ? 0 : heights[i];

            while (!stack.isEmpty() && heights[stack.peek()] > cur) {
                int h = heights[stack.pop()];

                int width = stack.isEmpty() ? i : i - stack.peek() - 1;

                areaMax = Math.max(areaMax, h * width);
            }

            if (i < n)
                stack.push(i);
        }
        return areaMax;
    }
}
