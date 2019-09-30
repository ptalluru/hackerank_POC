package com.demo.cg.DemoNew.HackerRank;

import java.io.IOException;
import java.util.Scanner;

public class UtopianTree {

    // Complete the utopianTree function below.
    static int utopianTree(int n) {
    	int height = 0;
    	for (int i = 0; i <= n; i++) {
			if(i==0) {
				height = 1;
			}else if(i%2==1) {
				height = height * 2;
			}else if(i%2==0) {
				height = height + 1;
			}
		}
		return height;
    }
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter the number of test cases");
        int t = scanner.nextInt();
        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            int result = utopianTree(n);
            System.out.println(result);
        }
        scanner.close();
    }
}
