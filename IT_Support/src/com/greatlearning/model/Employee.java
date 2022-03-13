/**
 * 
 */
package com.greatlearning.model;

/**
 * @author Rahul Dubey
 *
 */
public class Employee extends Company {

	/**
	 * Data members: 
	 * 	- String firstName : To store the firstName. 
	 * 	- String lastName : To store the lastName 
	 * 	- String email : To store the Email 
	 * 	- String password : To store the password 
	 * 	- String department : To store the department
	 * Parameterized Constructor: to intialize the firstName and lastName
	 * Methods: 
	 * 	- String getemp_Department(): getter method for fetching employee department 
	 * 	- void setemp_Department(String department) : setter method to add employee department 
	 * 	- String getEmail(): getter method for fetching the employee email 
	 * 	- void setEmail(String email): setter method to add employee email 
	 * 	- String getPassword(): getter method to fetch employee password 
	 * 	- void setPassword(String password): setter method to add employee password 
	 * 	- String getFirstname():getter method to fetch FirstName 
	 * 	- String getLastname():getter method to fetch LastName
	 */
	private String firstName = "";
	private String lastName = "";
	private String email = "";
	private String password ="";
	private String emp_department="";
	
	public String getemp_Department() {
		return emp_department;
	}

	public void setemp_Department(String department) {
		this.emp_department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password.toString();
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstname() {
		return firstName;
	}

	public String getLastname() {
		return lastName;
	}

}
