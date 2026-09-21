import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();

        backtracking(1, k, n, new ArrayList<>(), result);

        return result;
    }

    private void backtracking(int start, int k, int target, List<Integer> current, List<List<Integer>> result) {
        if (k == 0) {
            if (target == 0) {
                result.add(new ArrayList<>(current));
            }
            return;
        }

        for (int i = start; i <= 9; i++) {

            if (i > target) {
                break;
            }

            current.add(i);

            backtracking(i + 1, k - 1, target - i, current, result);

            current.remove(current.size() - 1);
        }
    }
}
