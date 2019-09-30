package com.cg.training.collection;

import java.util.HashSet;
import java.util.Set;

class Employee implements Comparable {
	int empId;
	String empName;

	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	@Override
	public int compareTo(Object arg0) {
		return ((Employee)arg0).empId - this.empId;
	}
}

public class HashSetDemo {

	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(new Employee(101, "Satyen"));
		set.add(new Employee(102, "Dinesh"));
		set.add(new Employee(101, "Satyen"));
		for (Object employee : set) {
			System.out.println(employee);
		}
	}

}






