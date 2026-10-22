import javax.swing.tree.TreeNode;

public class SerializeandDeserializeBinaryTree {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        preorder(root, sb);
        return sb.toString();
    }

    private void preorder(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("N,");
            return;
        }

        sb.append(root.val).append(",");
        preorder(root.left, sb);
        preorder(root.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] node = data.split(",");
        int[] index = { 0 };

        return buildTree(node, index);
    }

    private TreeNode buildTree(String[] node, int[] index) {
        String value = node[index[0]++];

        if (value.equals("N")) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(value));

        root.left = buildTree(node, index);
        root.right = buildTree(node, index);

        return root;
    }
}
