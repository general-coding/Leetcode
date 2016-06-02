package algorithms.easy;

/**
 * @author Puneeth U Bharadwaj
 * 
 *         https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * 
 *         Given a binary tree, find its maximum depth. The maximum depth is the
 *         number of nodes along the longest path from the root node down to the
 *         farthest leaf node.
 *
 */

public class E104_MaximumDepthOfBinaryTree {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}

	}

	public int maxDepth(TreeNode root) {
		int depthLeft = 1;
		int depthRight = 1;

		if (root == null) {
			return 0;
		} else {
			if (root.left != null) {
				depthLeft = maxDepth(root.left) + 1;
			}
			if (root.right != null) {
				depthRight = maxDepth(root.right) + 1;
			}
			return (depthLeft > depthRight) ? depthLeft : depthRight;
		}
	}

	// public static void main(String[] args) {
	// }

}
