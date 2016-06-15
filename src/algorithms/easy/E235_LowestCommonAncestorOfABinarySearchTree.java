package algorithms.easy;

/**
 * @author Puneeth U Bharadwaj
 * 
 *         https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-
 *         search-tree/
 * 
 *         Given a binary search tree (BST), find the lowest common ancestor
 *         (LCA) of two given nodes in the BST.
 * 
 *         According to the definition of LCA on Wikipedia: “The lowest common
 *         ancestor is defined between two nodes v and w as the lowest node in T
 *         that has both v and w as descendants (where we allow a node to be a
 *         descendant of itself).”
 *
 */

public class E235_LowestCommonAncestorOfABinarySearchTree {

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		while (root != null) {
			if (p.val > root.val && q.val > root.val) {
				root = root.right;
				continue;
			}
			if (p.val < root.val && q.val < root.val) {
				root = root.left;
				continue;
			}
			return root;
		}
		return null;
	}

	public static void main(String[] args) {

	}

}
