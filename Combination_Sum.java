public class Combination_Sum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start,
            List<Integer> current, List<List<Integer>> result) {

        // Base case: valid combination
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Explore choices
        for (int i = start; i < candidates.length; i++) {

            // If number exceeds target, skip
            if (candidates[i] > target)
                continue;

            // Choose
            current.add(candidates[i]);

            // Recurse (same index i because reuse allowed)
            backtrack(candidates, target - candidates[i], i, current, result);

            // Backtrack
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        CombinationSum obj = new CombinationSum();

        int[] candidates = { 2, 3, 6, 7 };
        int target = 7;

        List<List<Integer>> result = obj.combinationSum(candidates, target);
        System.out.println(result);
    }
}
