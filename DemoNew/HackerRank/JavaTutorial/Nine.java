package com.demo.cg.DemoNew.HackerRank.JavaTutorial;

import java.io.IOException;
import java.util.Scanner;

public class Nine {

    // Complete the factorial function below.
    static int factorial(int n) {
    	if(n<=1) {
    		return n;
    	}else {
    		return n*factorial(n-1);
    	}
    }

    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter the number");
        int n = scanner.nextInt();
        int result = factorial(n);
        System.out.println("Result : "+result);
        scanner.close();
    }
}
