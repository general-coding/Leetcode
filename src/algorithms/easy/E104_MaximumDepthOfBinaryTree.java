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
		if (root == null)
	        {
	            return 0;
	        }
	        else 
	        {
	            return Math.Max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
	        }
	}

	// public static void main(String[] args) {
	// }

}
