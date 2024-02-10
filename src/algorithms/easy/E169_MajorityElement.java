package algorithms.easy;

import java.util.Arrays;

/**
 * @author Puneeth U Bharadwaj
 * 
 *         https://leetcode.com/problems/majority-element/
 * 
 *         Given an array of size n, find the majority element. The majority
 *         element is the element that appears more than ⌊ n/2 ⌋ times.
 * 
 *         You may assume that the array is non-empty and the majority element
 *         always exist in the array.
 *
 */

public class E169_MajorityElement {
	public int majorityElement(int[] nums) {
	        Array.Sort(nums);
	        return nums[nums.Length / 2];
	}

	public static void main(String[] args) {
		int[] nums = { -1, 100, 2, 100, 100, 4, 100 };
		System.out.println(new E169_MajorityElement().majorityElement(nums));
	}

}
