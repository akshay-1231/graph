package graphexample;

public class EmployeeNode {
	int id;
	String name;
	double salary;
	String email;
	EmployeeNode next;

	public EmployeeNode(int id, String name, double salary, String email) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.email = email;
		this.next = null;
	}
}

class EmployeeManagementSystem {
	private EmployeeNode head;

	public String addEmployee(int id, String name, double salary, String email) {
		if (findEmployeeById(id) != null) {
			return "Error: Employee ID must be unique.";
		}

		EmployeeNode newEmployee = new EmployeeNode(id, name, salary, email);
		if (head == null) {
			head = newEmployee;
		} else {
			EmployeeNode current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newEmployee;
		}
		return "Employee added successfully!";
	}

	public String findEmployeeById(int id) {
		EmployeeNode current = head;
		while (current != null) {
			if (current.id == id) {
				return "ID: " + current.id + ", Name: " + current.name + ", Salary: " + current.salary + ", Email: "
						+ current.email;
			}
			current = current.next;
		}
		return "Error: Employee not found.";
	}

	public String displayAllEmployees() {
		if (head == null) {
			return "No employees to display.";
		}

		StringBuilder employeeList = new StringBuilder();
		EmployeeNode current = head;
		while (current != null) {
			employeeList.append("ID: ").append(current.id).append(", Name: ").append(current.name).append(", Salary: ")
					.append(current.salary).append(", Email: ").append(current.email).append("\n");
			current = current.next;
		}
		return employeeList.toString();
	}
}
