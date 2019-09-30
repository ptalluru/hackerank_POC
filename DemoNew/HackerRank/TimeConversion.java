package com.demo.cg.DemoNew.HackerRank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Scanner;

public class TimeConversion {

	/*
	 * Complete the timeConversion function below.
	 */
	static String timeConversion(String s) {
        String result = null;
        String[] str = s.split(":");
        String sub = str[2].substring(2, str[2].length());
        if (str[2].contains(sub)) {
            str[2] = str[2].replace(sub, "");
        }
        int hour = Integer.valueOf(str[0]);
        if (sub.equalsIgnoreCase("PM")) {
            if (hour < 12 && hour > 1) {
                hour = hour + 12;
            } else if (hour == 12) {
                hour = 12;
            }
            str[0] = String.format("%02d", hour);
            result = str[0] + ":" + str[1] + ":" + str[2];
        } else if (sub.equalsIgnoreCase("AM") && (hour == 12 || hour == 0)) {
            
            hour = 0;
            str[0] = String.format("%02d", hour);
            result = str[0] + ":" + str[1] + ":" + str[2];
        }
        result = str[0] + ":" + str[1] + ":" + str[2];
        return result;
    }
		//result = str[0] + ":" + str[1] + ":" + str[2];
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the  time string : ");
		String s = scan.nextLine();

		String result = timeConversion(s);
		System.out.println(result);
	}
}
