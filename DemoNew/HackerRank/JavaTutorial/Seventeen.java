package com.demo.cg.DemoNew.HackerRank.JavaTutorial;

import java.util.Scanner;

//Write your code here
class Calculator{

	public int power(int n, int p) throws Exception {
			if(n >= 0 && p >= 0) {
				return (int) (Math.pow(n, p));
			}else {
				throw new Exception("n and p should be non-negative");
			}
	}
	
}
class Seventeen{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        System.out.println("Enter t");
        int t = in.nextInt();
        while (t-- > 0) {
        	System.out.println("Enter n");
            int n = in.nextInt();
            System.out.println("Enter p");
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
