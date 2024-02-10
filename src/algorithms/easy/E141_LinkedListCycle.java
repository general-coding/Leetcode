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
	        ListNode fast = head, slow = head;
	        while (fast != null && fast.next != null)
	        {
	            fast = fast.next.next;
	            slow = slow.next;
	            if (fast == slow) return true;
	        }
	        return false;
	}

	public static void main(String[] args) {
		System.out.println(new E141_LinkedListCycle().hasCycle(null));
	}

}
