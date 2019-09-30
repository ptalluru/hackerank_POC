package com.demo.cg.DemoNew;

import java.util.Scanner;

/**
 * 
 * Determine whether an integer is a palindrome. An integer is a palindrome when
 * it reads the same backward as forward. Example 1: Input: 121 Output: true
 * 
 * Example 2: Input: -121 Output: false Explanation: From left to right, it
 * reads -121. From right to left, it becomes 121-. Therefore it is not a
 * palindrome.
 * 
 * Example 3: Input: 10 Output: false Explanation: Reads 01 from right to left.
 * Therefore it is not a palindrome.
 *
 */
public class PalinCheckWithSign {
	public static int originalStatic;

	/**
	 * 
	 * @param number
	 * @return
	 * This method returns the reverse of the number
	 * 
	 */
	public int reverse(int number) {
		String string = String.valueOf(number);
		StringBuilder sb = new StringBuilder(string);
		string = sb.reverse().toString();
		System.out.println("Reverse : " + string);
		int reverse = 0;
		try {
			reverse = Integer.valueOf(string);
		} catch (Exception e) {
		}
		return reverse;
	}

	/**
	 * 
	 * @param number
	 * @return
	 * This method return the String message whether the given number is palindrome or not.
	 * 
	 */
	public String PalinCheck(int number) {
		if (originalStatic == number) {
			return "Entered number is palindrome";
		}
		return "Entered number is not a palindrome";
	}

	/**
	 * 
	 * @param args
	 * @throws NumberFormatException
	 * Main Thread
	 * 
	 */
	public static void main(String[] args) throws NumberFormatException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check");
		int original = sc.nextInt();
		originalStatic = original;
		PalinCheckWithSign r = new PalinCheckWithSign();//Instantiation
		r.PalinCheck(r.reverse(original));

	}
}
