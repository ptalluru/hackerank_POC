package com.demo.cg.DemoNew.HackerRank.JavaTutorial;

import java.util.Scanner;

public class Six {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner sc = new Scanner(System.in);
    	int testCases = sc.nextInt();
    	for(int i=0;i<testCases;i++) {
    		if(i==0) {
    			sc.nextLine();
    			String string = sc.nextLine();
    			evenOdd(string);
    		}else {
    			String string = sc.nextLine();
        		evenOdd(string);
    		}
    		
    	}
    }

	private static void evenOdd(String string) {
		char[] ch = string.toCharArray();
		String even ="";
		String odd ="";
		for(int i = 0 ;i<ch.length;i++) {
			if(i==0||i%2==0) {
				even=even.concat(Character.toString(ch[i]));
			}else {
				odd=odd.concat(Character.toString(ch[i]));
			}
		}
		System.out.println(even+" "+odd);
	}
}

