package graphexample;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		EmployeeManagementSystem ems = new EmployeeManagementSystem();

		while (true) {
			System.out.println("1. Add Employee");
			System.out.println("2. Find Employee by ID");
			System.out.println("3. Display All Employees");
			System.out.println("4. Exit");
			System.out.print("Choose an option: ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter ID: ");
				int id = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter Name: ");
				String name = scanner.nextLine();
				System.out.print("Enter Salary: ");
				double salary = scanner.nextDouble();
				scanner.nextLine();
				System.out.print("Enter Email: ");
				String email = scanner.nextLine();
				System.out.println(ems.addEmployee(id, name, salary, email));
				break;
			case 2:
				System.out.print("Enter Employee ID to search: ");
				int searchId = scanner.nextInt();
				System.out.println(ems.findEmployeeById(searchId));
				break;
			case 3:
				System.out.println("Employee List:\n" + ems.displayAllEmployees());
				break;
			case 4:
				System.out.println("Exiting...");
				scanner.close();
				return;
			default:
				System.out.println("Invalid option.");
			}
		}
	}
}
