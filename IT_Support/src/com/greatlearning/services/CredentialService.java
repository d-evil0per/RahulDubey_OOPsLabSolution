/**
 * 
 */
package com.greatlearning.services;
/**
 * @author Rahul Dubey
 *
 */
import com.greatlearning.model.Company;
import com.greatlearning.model.Employee;


import java.util.HashMap;
import java.util.List;
import java.util.Random;


/**
 * @author Rahul Dubey
 *
 */
public class CredentialService {

	public void generatePassword(Employee emp) {
		String allowed_char = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$*&";
		String password = "";
		Random random = new Random();
		int password_length = 8;
		for (int i = 0; i < password_length; i++) {
			int index = random.nextInt(allowed_char.length());
			char randomchar = allowed_char.charAt(index);
			password = password + randomchar;
			emp.setPassword(password);
		}
	}

	public void showCredentials(Employee emp) {
		/*
		 * 
		 * Dear Harshit your generated credentials are as follows Email --->
		 * harshitchoudary@tech.abc.com Password ---> 181E@wFT
		 * 
		 */

		String firstName = emp.getFirstname();
		String lastName = emp.getLastname();
		String email = emp.getEmail();
		String password = emp.getPassword();
		String department = emp.getemp_Department();
		/*
		 * Saving the employee details in List of HashMap
		 */
		HashMap<String, String> employee_details = new HashMap<>();
		employee_details.put("FirstName", firstName);
		employee_details.put("lastName", lastName);
		employee_details.put("email", email);
		employee_details.put("password", password);
		employee_details.put("department", department);
		Company.setEmployee_list(employee_details);

		System.out.println("Dear " + firstName + " your generated credentials are as follows");
		System.out.println("Email ---> " + email);
		System.out.println("Password ---> " + password);
		System.out.println();

	}

	public boolean checkemail(String email)
	{
		List <HashMap <String,String>> employee_list =Company.getEmployee_list();
		for(HashMap <String,String> details:employee_list)
		{
			if (details.containsValue(email)) {
				return true;
			}
		}
		return false;
	}
	public boolean generateEmailAddress(Employee emp, String departmentName) {

		// ex: firstNamelastName@department.company.com
		String email = "";
		String firstName = emp.getFirstname();
		String lastName = emp.getLastname();
		String department_alias = "";
		String companyName = emp.getCompanyName();
		emp.setemp_Department(departmentName);
		HashMap<String, String> departmentMap = emp.getDepartment();
		if (departmentMap.containsKey(departmentName)) {
			department_alias = departmentMap.get(departmentName);
		}
		email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department_alias + "." + companyName;
		try {
			boolean alreadyExists=checkemail(email);
			if(alreadyExists)
			{
				throw new ServiceExceptions("User Already Exists!!");
			}
			emp.setEmail(email);
			return true;
		}
		catch(ServiceExceptions e)
		{
			System.out.println(e);
			return false;
		}

	}

}
