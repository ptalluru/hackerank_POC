package com.cg.training.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class SortEmployeeByName implements Comparator {
	@Override
	public int compare(Object arg0, Object arg1) {
		return ((Employee)arg0).empName.compareTo(((Employee)arg1).empName);
	}
}
public class TreeSetDemo {

	public static void main(String[] args) {
		Set set = new TreeSet(new SortEmployeeByName());
		set.add(new Employee(101, "Satyen"));
		set.add(new Employee(100, "Vikram"));
		set.add(new Employee(9, "Dinesh"));
		set.add(new Employee(9, "Dinesh"));
		set.add(new Employee(105, "Vibhu"));
		
		for (Object object : set) { 
			System.out.println(object);
		}
		
		for (Object object : set) {
			if(((Employee)object).empName.equals("Satyen")){
				((Employee)object).empId = 102;
			}
			System.out.println(object);
		}
		
		Employee e1=null;
		for (Object object : set) {
			if(((Employee)object).empName.equals("Satyen")){
				e1 = ((Employee)object);
				break;
			}
		}
		
		e1.empId = 103;
		set.add(e1);
		for (Object object : set) { 
			System.out.println(object);
		}
		
		List list = new ArrayList();
		list.add(new Employee(101, "Satyen"));
		list.add(new Employee(100, "Vikram"));
		list.add(new Employee(9, "Dinesh"));
		list.add(new Employee(9, "Dinesh"));
		list.add(new Employee(105, "Vibhu"));
		
		((Employee)list.get(0)).empId = 102;
		
		for (Object object : list) {
			System.out.println(object);
		}
		
	}

}












