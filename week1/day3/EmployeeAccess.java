import java.util.Scanner;

public class EmployeeAccess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int employee_ID;
		String employee_Name;
		int Age;
		String department_Choice;
		String role;
		int basic_Salary;
		int allowance = 0;
		int final_salary;
		String Access_level;

		System.out.println("Enter your Employee Id");
		employee_ID = sc.nextInt();
		System.out.println("Enter your Employee Name");
		employee_Name = sc.next();
		System.out.println("Enter Your Age: ");
		Age  = sc.nextInt();

		if(Age<21){
			System.out.println("Employee is not eligible to work");
			return;
		}

		System.out.println("Enter Department");
		department_Choice  = sc.next();

		if(!(department_Choice.equals("IT") || department_Choice.equals("HR") || department_Choice.equals("Finance"))){
			System.out.println("Enter correct depatment IT or HR or Finance");
			return;

		}


		else{
			System.out.println("Enter role");
			role = sc.next();
			switch(department_Choice) {
				case "IT":
					switch (role) {
						case "Developer":
							allowance = 30;
							break;
						case "Tester":
							allowance = 25;
							break;
						default:
							System.out.println("Enter correct department role Developer or Tester");
							return;
					}
					break;
				case "HR":
					switch (role) {
						case "Recruiter":
							allowance = 20;
							break;
						case "Payroll":
							allowance = 22;
							break;
						default:
							System.out.println("Enter correct department role Recruiter or Payroll");
							return;

					}
					break;
				case "Finance" :
					switch (role) {
						case "Accountant":
							allowance = 28;
							break;
						case "Auditor":
							allowance = 26;
							break;
						default:
							System.out.println("Enter correct department role Accountant or Auditor");
							return;
					}

				break;
				default:
					System.out.println("Enter correct role ");
					return;
			}
		}

		System.out.println("Enter your basic Salary");
		basic_Salary = sc.nextInt();
		final_salary = basic_Salary + ((basic_Salary *allowance)/100);
		if(final_salary>= 60000 && department_Choice.equals("IT")){
			Access_level = "Admin access";
		}
		else if(final_salary>=60000){
			Access_level = "Manager Acess";
		}
		else {
			Access_level = "Employee Access";
		}

		
		System.out.println("Your employee id is: " +employee_ID);
		System.out.println("Your Name is: " +employee_Name);
		System.out.println("Your Department Role : " +department_Choice);
		System.out.println("Your employee role is: " +role);
		System.out.println("Your basic_Salary: " +basic_Salary);
		System.out.println("Your final salary: " +final_salary);
		System.out.println("Your Access level is: " + Access_level);








	}
}
