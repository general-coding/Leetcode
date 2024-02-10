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
	        ListNode it = head;
	        while(it != null && it.next != null){
	            while(it.next != null && it.val == it.next.val){
	                deleteDuplicate(ref it);
	            }
	            it = it.next;
	        }
	        return head;
	}

	    private void deleteDuplicate(ref ListNode node){
	        ListNode next = node.next.next;
	        node.next.next = null;
	        node.next = next;
	    }

	public static void main(String[] args) {
		System.out.println(new E083_RemoveDuplicatesFromSortedList().deleteDuplicates(null));
	}

}
