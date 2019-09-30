package Inheritance;

public class CloningExample implements Cloneable{
	String abc = new String("Ajay");
	String cde = new String("Ajay");
	public String check() {
		return abc.equalsIgnoreCase(cde)?"equal":"not equal";
	}

	public static void main(String... args) throws CloneNotSupportedException {
		CloningExample ce = new CloningExample();
		System.out.println(ce.check());
		/*
		 * System.out.println(ce.toString()); System.out.println(ce.hashCode());
		 * System.out.println(ce.clone().hashCode());
		 */

	}
}
