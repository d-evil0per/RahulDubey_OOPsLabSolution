package com.greatlearning.model;

import java.util.*;

/**
 * @author Rahul Dubey
 *
 */
public class Company {
	
	/**
	 * Data members:
	 * 	String companyName : To store the company Name.
	 * 	HashMap<String, String> department : To store the key,value pair for Department and it's alias ex: Technical=tech
	 * 	static List<HashMap<String, String>> employee_list : Class data member to store the list of all employee whose email and password got generated.
			ex: { FirstName=Rahul, LastName=Dubey, Email=rahuldubey@tech.greatlearning.com, Password=vk*s7BPt, Department=Technical}
	 * Constructor: to intialize the department Hashmap
	 * Metchods:
	 * 	String getCompanyName(): getter method for fetching company name
	 * 	HashMap<String, String> getDepartment() : getter method for fetching list of Department
	 * 	static List<HashMap<String, String>> getEmployee_list(): getter method for fetching the records of employee onboarded
	 * 	void setEmployee_list(HashMap<String, String> employee_list): setter method to add the record of employee
	 * 	static void getEmployeeDatabase(): getter method to fetch the list of employees
	 */
	
	private String companyName = "greatlearning.com";
	private HashMap<String, String> department = new HashMap<>();
	private static List<HashMap<String, String>> employee_list = new ArrayList<HashMap<String, String>>();

	public static List<HashMap<String, String>> getEmployee_list() {
		return employee_list;
	}

	public static void setEmployee_list(HashMap<String, String> employee_list) {
		Company.employee_list.add(employee_list);
	}

	public Company() {
		this.department.put("Technical", "tech");
		this.department.put("Admin", "admin");
		this.department.put("Human Resource", "hr");
		this.department.put("Legal", "legal");
	}

	public String getCompanyName() {
		return companyName;
	}

	public HashMap<String, String> getDepartment() {
		return department;
	}

	public static void getEmployeeDatabase() {
		int i = 0;
		for (HashMap<String, String> record : employee_list) {
			i++;
			System.out.println("=============================================");
			System.out.println("Record number: " + i);
			for (HashMap.Entry<String, String> entry : record.entrySet()) {
				System.out.print(entry.getKey() + " ===> ");
				System.out.print(entry.getValue());
				System.out.println();

			}
			System.out.println("=============================================");
		}

	}

}
