package algorithms.easy;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Puneeth U Bharadwaj
 * 
 *         https://leetcode.com/problems/intersection-of-two-arrays-ii/
 * 
 *         Example: Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
 * 
 *         Note: Each element in the result should appear as many times as it
 *         shows in both arrays. The result can be in any order.
 * 
 *         Follow up: What if the given array is already sorted? How would you
 *         optimize your algorithm? What if nums1's size is small compared to
 *         num2's size? Which algorithm is better? What if elements of nums2 are
 *         stored on disk, and the memory is limited such that you cannot load
 *         all elements into the memory at once?
 *
 */

public class E350_IntersectionOfTwoArraysII {

	static int[] intersection(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i : nums1) {
			if (hm.containsKey(i)) {
				hm.put(i, hm.get(i) + 1);
			} else {
				hm.put(i, 1);
			}
		}

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i : nums2) {
			if (hm.containsKey(i)) {
				if (hm.get(i) > 1) {
//					hm.put(i, hm.get(i) - 1);
//				} else {
//					hm.remove(i);
//				}
				list.add(i);}
			}
		}

		int[] x = new int[list.size()];
		int i = 0;
		while (i < list.size()) {
			x[i] = list.get(i);
			i++;
		}

		return x;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 1 };
		int[] b = { 2, 2 };

		int[] c = intersection(a, b);

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}

}
