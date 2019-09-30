package com.demo.cg.DemoNew;

import java.util.Scanner;

/**
 * 
 * @author ptalluru Given a string, you need to reverse the order of characters
 *         in each word within a sentence while still preserving whitespace and
 *         initial word order.
 * 
 *         Example 1: Input: "Let's take LeetCode contest" Output: "s'teL ekat
 *         edoCteeL tsetnoc"
 *
 */
public class SentenceWordCharOrder {
	public String reverseWords(String s) {
        String words[] = s.split(" ");
        StringBuilder res=new StringBuilder();
        for (String word: words)
            res.append(new StringBuffer(word).reverse().toString() + " ");
        return "String : "+res.toString().trim();
    }
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		SentenceWordCharOrder swco = new SentenceWordCharOrder();
		System.out.println("Enter the string to reverse the order of characters to each word in the entered sentence");
		String string = sc.nextLine();
		System.out.println("String : " + string);
		System.out.println(swco.reverseWords(string));
	}

}
