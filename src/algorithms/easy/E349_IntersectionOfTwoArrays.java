package algorithms.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Puneeth U Bharadwaj
 * 
 *         https://leetcode.com/problems/intersection-of-two-arrays/
 * 
 *         Given two arrays, write a function to compute their intersection.
 * 
 *         Example: Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 * 
 *         Note: Each element in the result must be unique. The result can be in
 *         any order.
 *
 */

public class E349_IntersectionOfTwoArrays {

	static int[] intersection(int[] a, int[] b) {
		// Set<Integer> aSet = new HashSet<Integer>();
		// Set<Integer> bSet = new HashSet<Integer>();
		//
		// for (int i = 0; i < a.length; i++) {
		// aSet.add(a[i]);
		// }
		// System.out.println(aSet);
		// for (int i = 0; i < b.length; i++) {
		// bSet.add(b[i]);
		// }
		// System.out.println(bSet);
		//
		// aSet.retainAll(bSet);
		//
		// int[] x = new int[aSet.size()];
		// int i = 0;
		// for (Integer j : aSet) {
		// x[i] = j;
		// }
		//
		// return x;

		Set<Integer> aSet = new HashSet<Integer>();
		Set<Integer> iSet = new HashSet<Integer>();
		for (Integer c : a) {
			aSet.add(c);
		}
		System.out.println(aSet);
		for (Integer c : b) {
			if (aSet.contains(c)) {
				iSet.add(c);
			}
		}
		System.out.println(iSet);

		int[] x = new int[iSet.size()];
		int i = 0;
		for (Integer j : iSet) {
			x[i++] = j;
			System.out.println(j);
		}

		return x;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2 };
		int[] b = { 2, 1 };

		int[] c = intersection(a, b);

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}

}
