package algorithms.easy;

/**
 * @author Puneeth U Bharadwaj
 * 
 *         https://leetcode.com/problems/reverse-string/
 *
 *         Write a function that takes a string as input and returns the string
 *         reversed. Example: Given s = "hello", return "olleh".
 * 
 */

public class E344_ReverseString {
	static String reverseString(String s) {
		StringBuffer str = new StringBuffer();

		for (int i = s.length() - 1; i >= 0; i--) {
			str.append(s.charAt(i));
		}

		return str.toString();
	}

	public static void main(String args[]) {
		System.out.println(reverseString("hello"));
	}
}
