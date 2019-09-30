package com.demo.cg.DemoNew.HackerRank;

import java.io.IOException;
import java.util.Scanner;

public class DayOfTheProgrammer {
	    // Complete the dayOfProgrammer function below.
	    static int result(int year) {
	        int month = 0;
	        int days = 0;
	        int totalDays = 0;
	        final int find = 256;
	        if (year >= 1700 && year <= 1917) {
	            for (month = 1; month <= 8; month++) {
	                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8) {
	                    days = 31;
	                    totalDays = totalDays + days;
	                } else if ((month == 2) && !((year % 4) == 0)) {
	                    days = 28;
	                    totalDays = totalDays + days;
	                } else if ((month == 2) && ((year % 4) == 0)) {
	                    days = 29;
	                    totalDays = totalDays + days;
	                } else {
	                    days = 30;
	                    totalDays = totalDays + days;
	                }
	            }
	        } else if (year >= 1918 && year <= 2700){
	            for (month = 1; month <= 8; month++) {
	                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8) {
	                    days = 31;
	                    totalDays = totalDays + days;
	                } else if ((month == 2) && (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)))  {
	                    days = 29;
	                    totalDays = totalDays + days;
	                } else if ((month == 2) && !(((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)))  {
	                    days = 28;
	                    totalDays = totalDays + days;
	                }else {
	                    days = 30;
	                    totalDays = totalDays + days;
	                }
	            }
	        }
	        return find - totalDays;
	    }
	    static String dayOfProgrammer(int year) {
	        String result = null;
	        String day = null;
	        int dayFinal = result(year);
	        if(year==1918) {
	            dayFinal=dayFinal+13;
	        }
	        day = String.format("%02d", dayFinal);
	        result = day + "." + "09" + "." + year;
	        return result;
	    }
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		String result = dayOfProgrammer(year);
		System.out.println(result);
	}
}
