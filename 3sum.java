class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class BinaryTreePathSum {

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        // Base case: an empty tree has no path
        if (root == null) {
            return false;
        }

        // If the current node is a leaf and its value equals the remaining target sum
        if (root.left == null && root.right == null && targetSum - root.val == 0) {
            return true;
        }

        // Recursively check the left and right subtrees
        boolean leftPath = hasPathSum(root.left, targetSum - root.val);
        boolean rightPath = hasPathSum(root.right, targetSum - root.val);

        // Return true if a path is found in either the left or right subtree
        return leftPath || rightPath;
    }

    public static void main(String[] args) {
        // Example usage
        // Construct a sample binary tree:
        //        5
        //       / \
        //      4   8
        //     /   / \
        //    11  13  4
        //   /  \      \
        //  7    2      1
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        int targetSum = 22;

        // Check if there is a root-to-leaf path with the given target sum
        boolean result = hasPathSum(root, targetSum);

        System.out.println("Does the tree have a root-to-leaf path with sum " + targetSum + "? " + result);
    }
}
