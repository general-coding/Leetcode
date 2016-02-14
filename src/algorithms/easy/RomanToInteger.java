package algorithms.easy;

import java.util.HashMap;

/**
 * @author Puneeth U Bharadwaj
 * 
 *         https://leetcode.com/problems/roman-to-integer/
 * 
 *         Given a roman numeral, convert it to an integer.
 * 
 *         Input is guaranteed to be within the range from 1 to 3999.
 *
 */

public class RomanToInteger {

	public int romanToInt(String s) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		hm.put('I', 1);
		hm.put('V', 5);
		hm.put('X', 10);
		hm.put('L', 50);
		hm.put('C', 100);
		hm.put('D', 500);
		hm.put('M', 1000);

		int integer = 0;

		for (int i = 0; i < s.length(); i++) {
			if (i > 0 && hm.get(s.charAt(i)) > hm.get(s.charAt(i - 1))) {
				System.out.println(i + " " + integer + " " + hm.get(s.charAt(i)) + " " + hm.get(s.charAt(i - 1)));
				integer = integer + hm.get(s.charAt(i)) - 2 * hm.get(s.charAt(i - 1));
			} else {
				integer = integer + hm.get(s.charAt(i));
			}
		}
		return integer;
	}

	public static void main(String[] args) {
		System.out.println(new RomanToInteger().romanToInt("XXI"));
	}

}
