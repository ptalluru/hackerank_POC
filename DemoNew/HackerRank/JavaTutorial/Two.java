package com.demo.cg.DemoNew.HackerRank.JavaTutorial;

import java.util.Scanner;

public class Two {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
    	//double tip_double = tip_percent/100;
    	double tip = (meal_cost)*((double)tip_percent/100); 
    	double tax = (meal_cost)*((double)tax_percent/100);
    	double totalCost = meal_cost+tip+tax;
    	int roundTotal = (int) Math.round(totalCost);
    	System.out.println(roundTotal);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
       
        int tip_percent = scanner.nextInt();
        
        int tax_percent = scanner.nextInt();
        
        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
