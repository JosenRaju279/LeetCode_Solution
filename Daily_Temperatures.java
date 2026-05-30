import java.util.Stack;

public class Daily_Temperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idc = stack.pop();
                ans[idc] = i - idc;
            }
            stack.push(i);
        }
        return ans;
    }
}
