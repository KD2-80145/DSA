package com.solution;


public class SortEmployees {

	public static void sortBySalary(Employee arr[]) {

		int n = arr.length;

		for (int i = 0; i < n-1; i++) {

			boolean swapped = false;

			for (int j = 0; j <n-i-1; j++) {
				if (arr[j].getSalary() > arr[j + 1].getSalary()) {
					Employee temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}
	}

	public static void main(String[] args) {

		Employee empArr[] = new Employee[5];

		empArr[0] = new Employee(95, "Zeus", 1000);
		empArr[1] = new Employee(100, "Abhey", 2000);
		empArr[2] = new Employee(25, "Ansh", 5000);
		empArr[3] = new Employee(34, "Rahul", 10000);
		empArr[4] = new Employee(90, "Sahil", 200);
		
		System.out.println("Before Sorting : ");
		
		for(Employee e:empArr)
		{
			System.out.println(e.getSalary());
		}
		
		System.out.println("After Sorting : ");
		sortBySalary(empArr);
		for(Employee e:empArr)
		{
			System.out.println(e.getSalary());
		}
	}

}
