package com.sunbeam;

import java.util.Arrays;

public class Solution02Main {

	private static int searchByEmpId(Employee arr[], int empId) {

		int leftIdx = 0, rightIdx = arr.length - 1;
		int mid;

		while (leftIdx <= rightIdx) {
			mid = (leftIdx + rightIdx) / 2;

			if (empId < arr[mid].getEmpId()) {
				rightIdx = mid - 1;
			} else if (empId > arr[mid].getEmpId()) {
				leftIdx = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	private static int searchByEmpName(Employee arr[], String eName) {

		int leftIdx = 0, rightIdx = arr.length - 1;
		int mid;

		while (leftIdx <= rightIdx) {
			mid = (leftIdx + rightIdx) / 2;

			// A.compareTo(B) -ve A-B 65-66
			// mid name is greater
			// Z-A 25
			if (eName.compareTo(arr[mid].getName()) > 0) {
				System.out.println(arr[mid].getName() + "left");
				leftIdx = mid + 1;
			} else if (eName.compareTo(arr[mid].getName()) < 0) {
				System.out.println(arr[mid].getName() + "right");
				rightIdx = mid - 1;
			} else if (eName.equals(arr[mid].getName())) {
				return mid;
			}
		}
		return -1;
	}

	public static int searchBySalary(Employee arr[], double eSalary) {
		int leftIdx = 0, rightIdx = arr.length - 1;
		int mid;

		while (leftIdx <= rightIdx) {
			mid = (leftIdx + rightIdx) / 2;
			double midSalary = arr[mid].getSalary();

			if (Double.compare(eSalary, midSalary) > 0) {
				leftIdx = mid + 1;
			} else if (Double.compare(eSalary, midSalary) < 0) {
				rightIdx = mid - 1;
			} else if (Double.compare(eSalary, midSalary) == 0) {
				return mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		Employee empArr[] = new Employee[5];

		empArr[0] = new Employee(95, "Zeus", 1000);
		empArr[1] = new Employee(100, "Abhey", 2000);
		empArr[2] = new Employee(25, "Ansh", 5000);
		empArr[3] = new Employee(34, "Rahul", 10000);
		empArr[4] = new Employee(90, "Sahil", 200);

//		Arrays.sort(empArr, (a,b)->a.getEmpId()-b.getEmpId());

		/*
		 * int key_id=34; int keyIdx=searchByEmpId(empArr, key_id);
		 * 
		 * System.out.println("Employee with empid : "+key_id+" found at idx : "+keyIdx)
		 * ;
		 * 
		 */
//
//		String name="A";
//		String name2="B";
//		System.out.println(name.compareTo(name2));
		
		/*
		Arrays.sort(empArr, (a, b) -> a.getName().compareTo(b.getName()));
		String key = "Zeus";
		int keyIdx = searchByEmpName(empArr, key);

		for (Employee e : empArr) {
			System.out.println(e);
		}

		System.out.println("Employee with Name : " + key + " found at idx : " + keyIdx);
		
		*/
		
		
		Arrays.sort(empArr, (a, b) -> Double.compare(a.getSalary(), b.getSalary()));
		double key = 1200;
		int keyIdx = searchBySalary(empArr, key);

		for (Employee e : empArr) {
			System.out.println(e);
		}

		System.out.println("Employee with Name : " + key + " found at idx : " + keyIdx);
		

	}

}
