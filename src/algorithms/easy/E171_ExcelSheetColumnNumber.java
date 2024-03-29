package algorithms.easy;

/**
 * @author Puneeth U Bharadwaj
 * 
 *         https://leetcode.com/problems/excel-sheet-column-number/
 * 
 *         Given a column title as appear in an Excel sheet, return its
 *         corresponding column number.
 * 
 *         For example:
 * 
 *         A -> 1 B -> 2 C -> 3 ... Z -> 26 AA -> 27 AB -> 28
 *
 */

public class E171_ExcelSheetColumnNumber {
	public int titleToNumber(String s) {
		int num = 0;
		for(int i=0;i<s.length();i++){
			num = num*26 + (s.charAt(i) - 'A') + 1;
		}
		return num;
	}

	public static void main(String[] args) {
		System.out.println(new E171_ExcelSheetColumnNumber().titleToNumber("XFD"));
	}

}
