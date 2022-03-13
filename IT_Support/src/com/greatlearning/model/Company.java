package com.greatlearning.model;

import java.util.*;

/**
 * @author Rahul Dubey
 *
 */
public class Company {
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
