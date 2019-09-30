package com.demo.cg.DemoNew;

public class SwapWithTemp {
	public static void main(String... args) {
		int a =2;//Declaring & Intitializing a 
		System.out.println(a);//Debugging a
		int b =3;//Declaring & Intitializing b
		System.out.println(b);//Debugging a
		int temp = a;//assigning a to temp
		System.out.println(temp);//Debugging temp after assigning a to temp
		a=b;//assigning b value to a
		System.out.println(a);//Debugging a
		b=temp;//assigning temp ie; a value to b
		System.out.println(b);//Debugging b
		System.out.println(a+"  "+b);//Debugging a and b after swapping
	}
}
