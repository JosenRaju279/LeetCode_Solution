import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();

        if (root == null)
            return result;
        dfs(root, new StringBuilder(), result);
        return result;
    }

    private void dfs(TreeNode root, StringBuilder path, List<String> result) {
        int len = path.length();

        if (len > 0)
            path.append("->");
        path.append(root.val);

        if (root.left == null && root.right == null) {
            result.add(path.toString());
        } else {
            if (root.left != null)
                dfs(root.left, path, result);
            if (root.right != null)
                dfs(root.right, path, result);
        }
        path.setLength(len);
    }
}
