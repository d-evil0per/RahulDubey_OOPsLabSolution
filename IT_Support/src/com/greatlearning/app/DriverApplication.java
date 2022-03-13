/**
 * 
 */
package com.greatlearning.app;

import com.greatlearning.model.Company;
import com.greatlearning.model.Employee;
import com.greatlearning.services.CredentialService;

import java.util.Scanner;

/**
 * @author Rahul Dubey
 *
 */
public class DriverApplication {
	private String firstName = "";
	private String lastName = "";
	private Scanner sc;

	/**
	 * @param args
	 */

	public DriverApplication() {
		this.sc = new Scanner(System.in);
	}

	public void addCredentials(int option) {
		System.out.println("Please enter your First Name:");
		firstName = sc.next();
		System.out.println("Please enter your Last Name:");
		lastName = sc.next();
		Employee emp = new Employee(firstName, lastName);
		String department_choice = "";
		switch (option) {
		case 1:
			department_choice = "Technical";
			break;
		case 2:
			department_choice = "Admin";
			break;
		case 3:
			department_choice = "Human Resource";
			break;
		case 4:
			department_choice = "Legal";
			break;
		default:
			System.out.println("Invalid option!! Please try again...");
		}

		CredentialService creds = new CredentialService();

		boolean status = creds.generateEmailAddress(emp, department_choice);
		if (status) {
			creds.generatePassword(emp);
			creds.showCredentials(emp);
		}

	}
	
	public void fetchEmployeeDB()
	{
		Company.getEmployeeDatabase();
		System.out.println("Thanks!!");
	}
	
	public static void main(String[] args) {
		DriverApplication driver = new DriverApplication();

		int option = 0;
		do {
			System.out.println("Please enter the department for the following");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");
			System.out.println("press 0 to Exit");

			option = driver.sc.nextInt();
			if (option != 0)
				driver.addCredentials(option);

		} while (option != 0);
		
		/*
		 * Added Extra logic to get the Employee Database that we created for all user.
		 */
		driver.fetchEmployeeDB();
	}

}
