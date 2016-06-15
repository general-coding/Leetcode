package algorithms.easy;

/**
 * @author Puneeth U Bharadwaj
 * 
 *         https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 * 
 *         Given a sorted linked list, delete all duplicates such that each
 *         element appear only once.
 * 
 *         For example, Given 1->1->2, return 1->2. Given 1->1->2->3->3, return
 *         1->2->3.
 *
 */

public class E083_RemoveDuplicatesFromSortedList {

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode prev = head;
		ListNode curr = head.next;

		while (curr != null) {
			if (curr.val == prev.val) {
				prev.next = curr.next;
				curr = curr.next;
			} else {
				prev = curr;
				curr = curr.next;
			}
		}
		return head;
	}

	public static void main(String[] args) {
		System.out.println(new E083_RemoveDuplicatesFromSortedList().deleteDuplicates(null));
	}

}
