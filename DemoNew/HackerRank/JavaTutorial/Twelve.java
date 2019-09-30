package com.demo.cg.DemoNew.HackerRank.JavaTutorial;

import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;
	public Student(String firstName, String lastName, int id, int[] testScores2) {
		super(firstName, lastName, id);
		this.testScores = testScores2;
	}
	public String calculate() {
		int sum = 0;
		String string = null;
		for (int i : testScores) {
			sum = sum + i;
		}
		int average = sum/testScores.length;
		if(average >= 90 && average <= 100) {
			string = "O";
		}else if(average >= 80 && average < 90) {
			string = "E";
		}else if(average >= 70 && average < 80) {
			string = "A";
		}else if(average >= 55 && average < 70) {
			string = "P";
		}else if(average >= 40 && average < 55) {
			string = "D";
		}else if(average < 40) {
			string = "T";
		}
		System.out.println(average);
		return string;
	}
}

class Twelve {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first name");
		String firstName = scan.next();
		System.out.println("Enter last name");
		String lastName = scan.next();
		System.out.println("Enter id");
		int id = scan.nextInt();
		System.out.println("Enter number of scores");
		int numScores = scan.nextInt();
		System.out.println("Enter the scores");
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}