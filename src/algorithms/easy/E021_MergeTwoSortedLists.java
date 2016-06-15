package algorithms.easy;

/**
 * @author Puneeth U Bharadwaj
 * 
 *         https://leetcode.com/problems/merge-two-sorted-lists/
 * 
 *         Merge two sorted linked lists and return it as a new list. The new
 *         list should be made by splicing together the nodes of the first two
 *         lists.
 *
 */

public class E021_MergeTwoSortedLists {
	
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		ListNode current = dummy;

		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				current.next = l1;
				l1 = l1.next;
			} else {
				current.next = l2;
				l2 = l2.next;
			}
			current = current.next;
		}

		if (l1 != null) {
			current.next = l1;
		} else {
			current.next = l2;
		}

		return dummy.next;
	}

	public static void main(String[] args) {
		System.out.println(new E021_MergeTwoSortedLists().mergeTwoLists(null, null));
	}

}
