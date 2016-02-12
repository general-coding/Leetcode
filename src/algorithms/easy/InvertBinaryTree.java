package algorithms.easy;

/**
 * @author Puneeth U Bharadwaj
 * 
 *         https://leetcode.com/problems/invert-binary-tree/
 * 
 *         	     4
 *			   /   \
 *			  2     7
 *			 / \   / \
 *			1   3 6   9
 *         
 *	             4
 *			   /   \
 *			  7     2
 *			 / \   / \
 *			9   6 3   1
 *
 */

public class InvertBinaryTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return null;
		}
		TreeNode left = root.left;
		root.left = root.right;
		root.right = left;
		invertTree(root.left);
		invertTree(root.right);
		return root;
	}

	public static void main(String[] args) {

	}

}
