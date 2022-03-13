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
	 * 
	 */
	private String firstName = "";
	private String lastName = "";
	private String email = "";
	private String password = "";
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
		return password;
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
