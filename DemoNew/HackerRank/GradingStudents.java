package com.demo.cg.DemoNew.HackerRank;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

class Result {

	/*
	 * Complete the 'gradingStudents' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * INTEGER_ARRAY grades as parameter.
	 */

	public static List<Integer> gradingStudents(List<Integer> grades) {
		int newValue = 0;
		List<Integer> newGrades = new ArrayList<>();
		for (Integer integer : grades) {
			if (integer >= 38 && integer <=100) {
				System.out.println("Integer : "+integer);
				int remainder = integer % 5;
				System.out.println("remainder : "+remainder);
				int round = (integer - remainder) + 5;
				System.out.println("round : "+round);
				int diff = integer - round;
				int absoluteDiff = Math.abs(diff);
				System.out.println("absoluteDiff : "+absoluteDiff);
				if ((absoluteDiff == 1) || (absoluteDiff == 2)) {
					newValue = round;
					System.out.println("newValue : "+newValue);
					newGrades.add(newValue);
				} else {
					newGrades.add(integer);
				}
			} else if (integer < 38 && integer >= 0) {
				newGrades.add(integer);
			}
		}
		return newGrades;
	}
}

public class GradingStudents {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count : ");
		int gradesCount = sc.nextInt();
		System.out.println("Enter the grades :");
		Integer[] grade = new Integer[gradesCount];
        for (int i = 0; i < gradesCount; i++) {
        	grade[i] = sc.nextInt();
        }
        List<Integer> grades =  Arrays.asList(grade);
		List<Integer> result = Result.gradingStudents(grades);
		System.out.println("Result : "+result);
	}
}
