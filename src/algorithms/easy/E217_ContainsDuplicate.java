package algorithms.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Puneeth U Bharadwaj
 * 
 *         https://leetcode.com/problems/contains-duplicate/
 * 
 *         Given an array of integers, find if the array contains any
 *         duplicates. Your function should return true if any value appears at
 *         least twice in the array, and it should return false if every element
 *         is distinct.
 *
 */

public class E217_ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (set.add(nums[i]) == false) {
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		System.out.println(new E217_ContainsDuplicate().containsDuplicate(new int[] { 0, 1, 0, 3, 12 }));
	}

}
