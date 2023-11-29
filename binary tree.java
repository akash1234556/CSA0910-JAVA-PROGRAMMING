class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class BalancedBinaryTree {

    public static void main(String[] args) {
        // Example usage:
        // Construct a balanced binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Is the binary tree highly balanced? " + isBalanced(root));
    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true; // An empty tree is considered balanced
        }

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        // Check if the heights of the left and right subtrees differ by more than one
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }

        // Recursively check the balance of left and right subtrees
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private static int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        // Recursively calculate the height of the subtree
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

        // The height of the current node is the maximum height of its left and right subtrees plus one
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
