# RahulDubey_OOPSLabSolutions

## problem statement :
You are an IT Support Administrator and are charged with the task of creating credentials for new hires

Your application should do the following:

- Generate an email with the following syntax:
	- firstNamelastName@department.company.com

- Determine the department (Technical, Admin, Human Resource, Legal)
- Generate a random password which will contain (number, capital letter, small letter & special character)
- Display the generated credentials
- Use parameterized constructor of class Employee, to pass firstName, lastName.
- Create a separate CredentialService which will have generatePassword, generateEmailAddress, & showCredentials method.

Please enter the department for the following:
1. Technical
2. Admin
3. Human Resource
4. Legal
press 0 to Exit


Sample output:

Dear Harshit your generated credentials are as follows
Email        --->  harshitchoudary@tech.abc.com
Password ---> 181E@wFT

## Solution design:

- **app/DriverApplication**: It help to drive through the entire application and provides user to interact with the application.
-  **model/Company**: Parent class to hold company specific details and employee list.
-   **model/Employee**: Class for Employees that inherit Company class to store the details of the employee.
-  **services/CredentialsServices**: Class to perform operation related to onboarding like password and email generation etc.
- **services/ServiceExceptions**: Class which extends Exception Class for use defined exceptions

![enter image description here](http://drive.google.com/uc?export=view&id=1j07vRWjrqBOAoBHYyOmzbxCQzRsRrH0r)

## Solution Blueprint:

- **model/Company Class**:
	- 
	- **Data members**:
		- **String companyName** : To store the company Name.
		- **HashMap<String, String> department** : To store the key,value pair for Department and it's alias
			- ex: Technical=tech
		- **static List<HashMap<String, String>> employee_list** : Class data member to store the list of all employee whose email and password got generated.
			- ex: { FirstName=Rahul, LastName=Dubey, Email=rahuldubey@tech.greatlearning.com, Password=vk*s7BPt, Department=Technical}
	-	**Constructor**: to intialize the department Hashmap 
	-	**Metchods**: 
		-	 **String getCompanyName()**:  getter method for fetching company name
		-	 **HashMap<String, String> getDepartment()** : getter method for fetching list of Department 
		-	 **static List<HashMap<String, String>> getEmployee_list()**: getter method for fetching the records of employee onboarded
		-	 **void setEmployee_list(HashMap<String, String> employee_list)**: setter method to add the record of employee
		-	 **static void getEmployeeDatabase()**: getter method to fetch the list of employees

- **model/Employee Class**:
	-  
	- **Data members**:
		- **String firstName** : To store the firstName.
		- **String lastName** : To store the lastName
		- **String email** : To store the Email
		- **String password** : To store the password
		- **String department** : To store the department
	- **Parameterized Constructor**: to intialize the firstName and lastName
	- **Metchods**: 
		- **String getemp_Department()**:  getter method for fetching  employee department
		- **void setemp_Department(String department)** : setter method to add employee department
		- **String getEmail()**: getter method for fetching the employee email
		- **void setEmail(String email)**: setter method to add employee email
		- **String getPassword()**: getter method to fetch employee password
		- **void setPassword(String password)**: setter method to add employee password
		- **String getFirstname()**:getter method to fetch FirstName
		- **String getLastname()**:getter method to fetch LastName
			
- **services/CredentailsServices**:
	- 
	- **Metchods**: 
		- **boolean generateEmailAddress(Employee emp, String departmentName)**:  to generate the email.
		- **boolean checkemail(String email)** : to check if user email already exists in that department
		- **void showCredentials(Employee emp)**: to display the generated Credentials
		- **void generatePassword(Employee emp)**: to generate password	
- **services/ServiceExceptions**:
	- 
	- **Data members**:
			- **String message** : To store the Exception Message.
	- 	**Parameterized Constructor**: to intialize the exception message
	-	**Metchods**: 
			-	 **String toString()**:  overrided the toString() to print the custom exceptions.

- **app/DriverApplication**:
	- 
	- **Data members**:
		- **String firstName** : To store the firstName.
		- **String lastName** : To store the lastName
		- **Scanner sc** : To get user input using java.util.Scanner; 
	- **Constructor**: to intialize the Scanner sc object for user input
	- **Metchods**: 
		-	**static void main(String[] args)** : Main method to drive the application
		-	**void fetchEmployeeDB()**:  To fetch the Empolyee List of the company
		-	**void addCredentials(int option)**:  To generate email,password of the employee
