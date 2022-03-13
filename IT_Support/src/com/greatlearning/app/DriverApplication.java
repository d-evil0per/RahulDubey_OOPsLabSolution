/**
 *  Driver Program that provides user interaction and Main program which drives problem statement
 */
package com.greatlearning.app;

import com.greatlearning.model.Company;
import com.greatlearning.model.Employee;
import com.greatlearning.services.CredentialService;
import com.greatlearning.services.ServiceExceptions;

import java.util.Scanner;

/**
 * @author Rahul Dubey
 * @date 03-13-2022
 *
 */

public class DriverApplication {

	/**
	 * Data members: - String firstName : To store the firstName. - String lastName
	 * : To store the lastName - Scanner sc : To get user input using
	 * java.util.Scanner; Constructor: to intialize the Scanner sc object for user
	 * input Methods: - static void main(String[] args) : Main method to drive the
	 * application - void fetchEmployeeDB(): To fetch the Employee List of the
	 * company - void addCredentials(int option): To generate email,password of the
	 * employee
	 *
	 */

	private String firstName = "";
	private String lastName = "";
	private Scanner sc;

	/**
	 * Default constructor to initialize the Scanner object once and to use it
	 * across the class
	 */

	public DriverApplication() {
		this.sc = new Scanner(System.in);
	}

	/**
	 * addCredentials(int option) : it takes the user input and generate the email
	 * and password respective to their department. @ params option: user-input
	 * integer value respective to its departments ex: 1 for Technical, 2 for Admin
	 * etc @ features: 1. User Input 2. User choice for department 3. Generation of
	 * email Address 4. Generation of password
	 */
	public void addCredentials(int option) {

		// Choice for the department according to the option that user had choosen
		String department_choice = "";
		try {
			switch (option) {
			case 0:
				throw new ServiceExceptions("Thanks for using this application...");
				
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
				throw new ServiceExceptions("Invalid option!! Please try again...");

			}
			// user input for his First name and last name
			System.out.println("Please enter your First Name:");
			firstName = sc.next();
			System.out.println("Please enter your Last Name:");
			lastName = sc.next();

			// Employee object to store the first name and last name
			Employee emp = new Employee(firstName, lastName);
			// CredentialService object to create an object
			CredentialService creds = new CredentialService();

			// fetching the status of email already exists (false) or not (true)
			boolean status = creds.generateEmailAddress(emp, department_choice);
			if (status) {
				creds.generatePassword(emp);
				creds.showCredentials(emp);
			}
		} catch (ServiceExceptions e) {
			System.out.println(e);
		}

	}

	/**
	 * it fetches the List of all employee whose email and password is already
	 * created
	 */

	public void fetchEmployeeDB() {
		Company.getEmployeeDatabase();
		
	}

	/**
	 * Main method, Execution will start from here and this is the starting point of
	 * the program
	 */

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
			driver.addCredentials(option);

		} while (option != 0);

		
		/*
		 * Added Extra logic to get the Employee Database that we created for all user.
		 */
		driver.fetchEmployeeDB();
		driver.sc.close();
	}

}
