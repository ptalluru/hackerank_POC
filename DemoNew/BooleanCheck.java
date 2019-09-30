package com.demo.cg.DemoNew;

public class BooleanCheck {
	
	 public static String booleanValueParser(String field) {
		 String result = "0";
			if (null != field && !field.isEmpty()) {
				if ("TRUE".equalsIgnoreCase(field)) {
					System.out.println("here 1");
					result = "1";
					return result;
				} else if ("FALSE".equalsIgnoreCase(field)) {
					System.out.println("here 2");
					result = "0";
					return result;
				}
			}
			System.out.println("here 3");
			return result;
		}
	 public static void main(String[] args) {
		 Boolean f = false;
		 String s = BooleanCheck.booleanValueParser(f.toString());
		 System.out.println(s);
	 }
}
