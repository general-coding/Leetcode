package algorithms.easy;

/**
 * @author Puneeth U Bharadwaj
 * 
 *         https://leetcode.com/problems/linked-list-cycle/
 * 
 *         Given a linked list, determine if it has a cycle in it.
 * 
 *         Follow up: Can you solve it without using extra space?
 *
 */

public class E141_LinkedListCycle {

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public boolean hasCycle(ListNode head) {
		ListNode node1 = head;
		ListNode node2 = head;

		if (head != null && head.next != null) {
			node2 = head.next;
		} else {
			return false;
		}

		while (node1 != null && node2 != null) {
			if (node1.val == node2.val)
				return true;

			node1 = node1.next;
			node2 = node2.next;
			if (node2 != null) {
				node2 = node2.next;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		System.out.println(new E141_LinkedListCycle().hasCycle(null));
	}

}
