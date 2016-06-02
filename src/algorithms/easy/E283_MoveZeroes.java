package algorithms.easy;

/**
 * @author Puneeth U Bharadwaj
 * 
 *         https://leetcode.com/problems/move-zeroes/
 * 
 *         Given an array nums, write a function to move all 0's to the end of
 *         it while maintaining the relative order of the non-zero elements.
 * 
 *         For example, given nums = [0, 1, 0, 3, 12], after calling your
 *         function, nums should be [1, 3, 12, 0, 0].
 * 
 *         Note: You must do this in-place without making a copy of the array.
 *         Minimize the total number of operations.
 *
 */

public class E283_MoveZeroes {

	public void moveZeroes(int[] nums) {
		// int[] num = new int[] { 0, 1, 0, 3, 12 };
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == 0) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

	public static void main(String[] args) {
		new E283_MoveZeroes().moveZeroes(new int[] { 0, 1, 0, 3, 12 });
	}

}
