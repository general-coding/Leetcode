package algorithms.easy;

/**
 * @author Puneeth U Bharadwaj
 * 
 *         https://leetcode.com/problems/reverse-linked-list/
 * 
 *         Reverse a singly linked list.
 *
 */

public class ReverseLinkedList {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode reverseListRecursive(ListNode head) {
		ListNode prev = null;
		ListNode next = null;

		while (head != null) {
			next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}

		return prev;
	}

	public ListNode reverseListIterative(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode prev = reverseListIterative(head.next);
		head.next.next = head;
		head.next = null;
		return prev;
	}

	public ListNode reverseList(ListNode head) {
		return reverseListRecursive(head);
//		return reverseListIterative(head);
	}

	public static void main(String[] args) {

	}

}
