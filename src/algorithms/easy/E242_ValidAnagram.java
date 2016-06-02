package algorithms.easy;

import java.util.Arrays;

/**
 * @author Puneeth U Bharadwaj
 * 
 *         https://leetcode.com/problems/valid-anagram/
 * 
 *         Given two strings s and t, write a function to determine if t is an
 *         anagram of s.
 * 
 *         For example, s = "anagram", t = "nagaram", return true. s = "rat", t
 *         = "car", return false.
 *
 */

public class E242_ValidAnagram {
	public boolean isAnagram(String s, String t) {
		char as[] = s.toCharArray();
		char at[] = t.toCharArray();
		boolean flag = true;
		Arrays.sort(as);
		Arrays.sort(at);

		if (s.length() != t.length()) {
			flag = false;
		} else {
			for (int i = 0; i < as.length; i++) {
				if (as[i] == at[i]) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		String s = "ab<";
		String t = "b<a";

		System.out.println(new E242_ValidAnagram().isAnagram(s, t));
	}

}
