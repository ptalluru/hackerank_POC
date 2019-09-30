package com.demo.cg.DemoNew.HackerRank.JavaTutorial;

import java.util.Scanner;

public class Four {
    private int age;	
  
	public Four(int initialAge) {
		if(initialAge>=0) {
			this.age = initialAge;
		}else {
			this.age=0;
			System.out.println("Age is not valid, setting age to 0.");
		}
		
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
		if(age<13) {
  			System.out.println("You are young.");
  		}else if(age>=13 && age<18) {
  			System.out.println("You are teenager.");
  		}else {
  			System.out.println("You are old.");
  		}
	}

	public void yearPasses() {
  		age = age +1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter T");
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Four p = new Four(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}