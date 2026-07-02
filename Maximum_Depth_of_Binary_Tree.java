import javax.swing.tree.TreeNode;

public class Maximum_Depth_of_Binary_Tree {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        int leftdepth = maxDepth(root.left);
        int rightdepth = maxDepth(root.right);

        return 1 + Math.max(leftdepth, rightdepth);
    }
}
