package com.demo.cg.DemoNew.HackerRank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BonAppetit {

    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {
    	int[] arr = bill.stream().mapToInt(Integer::intValue).toArray();
    	int sum = 0;
    	for (int i = 0; i < arr.length; i++) {
			if(i!=k) {
				sum=sum+arr[i];
			}
		}
    	int expectedPrice=sum/2;
    	if(b==expectedPrice) {
    		System.out.println("Bon Appetit");
    	}else {
    		int result = arr[k]/2;
    		System.out.println(result);
    	}
    }

    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter no. of items");
        int n = sc.nextInt();
        System.out.println("Enter index no. that anna allergic to");
        int k = sc.nextInt();
        System.out.println("Enter elements of the list");
        List<Integer> bill = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
			int item = sc.nextInt();
			bill.add(item);
		}
        System.out.println("Enter the price charged to anna by brian");
        int b = sc.nextInt();

        bonAppetit(bill, k, b);
    }
}
