package com.demo.cg.DemoNew;

import java.util.Scanner;

/**
 * 
 * @author ptalluru
 *
 */
public class PalinCheckWithoutSign {
	public static int originalStatic;

	/**
	 * 
	 * @param number
	 * @return
	 * This method reverse the give number and returns the value which is reversed
	 * 
	 */
	public int reverse(int number) {
		int reverse = 0;
		while (number != 0) {
			int temp = number % 10;
			reverse = reverse * 10 + temp;
			number /= 10;
		}
		return reverse;
	}

	/**
	 * 
	 * @param number
	 * @return This method checks whether the number is palindrome or not and
	 *         returns the string message.
	 */
	public String PalinCheck(int number) {
		System.out.println(originalStatic);
		System.out.println(number);
		if (originalStatic == number) {
			return "Entered number is palindrome";
		}
		return "Entered number is not a palindrome";
	}

	/**
	 * 
	 * @param args
	 * @throws NumberFormatException Main method
	 * 
	 */
	public static void main(String[] args) throws NumberFormatException {
		Scanner sc = new Scanner(System.in);// Scanner to read the input from commandline
		System.out.println("Enter the number to check");
		int original = sc.nextInt();// Enter any integer and store it in original
		originalStatic = original;// store the original in static variable which will be useful in further methods
		PalinCheckWithoutSign r = new PalinCheckWithoutSign();// Instantiating
		r.PalinCheck(r.reverse(original));// passing original as parameter to reverse(),
		// which will return reverse of the entered number and the result is used as
		// parameter to the PalinCheck()
		// to check the entered number is palindrome or not
	}
}