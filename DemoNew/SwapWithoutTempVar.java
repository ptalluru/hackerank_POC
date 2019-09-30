package com.demo.cg.DemoNew;

import java.util.Scanner;

public class SwapWithoutTempVar {
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);//Scanner for commandline inputs
		int a=sc.nextInt();//to get a through commandline
		System.out.println(a);//debugging a
		int b=sc.nextInt();// to get b through commandline
		System.out.println(b);//debugging b
		a=a+b;//adding both a and b and assigning the result value to a
		System.out.println(a);//debugging a
		b=a-b;//after a value is updated minus b from a , so that the initial a value will be assigned to b 
		System.out.println(b);//debugging b
		a=a-b;//now b is initial a value(b value is swapped with a value) and 
		//a value is addition both a and b initial values so a-b will give the result as initial b value,
		//which will be assigned to a now, Hence swapping done.
		System.out.println(a);//debugging a after swapping
		
		System.out.println("After swap a:-"+a+"b:-"+b);//debugging both a and b values after swapping
	}

}
