package main;

public class Employee extends AbstractAccountActions {
	
	//DRY DONT REPEAT YOURSELF
	private String firstName;
	private String lastName;
	private int employeeId;
	private String jobTitle;
	
	public Employee() {
		
	};
	
	public Employee(String firstName, String lastName, int employeeId, String jobTitle) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.jobTitle = jobTitle;	
	}
	public Employee(String firstName, String lastName, int employeeId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;	
	}
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;	
	}
	// void means were not returning anything
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getLastName() {
		return lastName;
	}
	public long getEmployeeId() {
		return employeeId;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public String getFirstName() {
		return firstName;
	}
	
	@Override
	public String toString() {
		return "Employee [firstName= " + firstName + ", "
				+ "lastName= " + lastName + ", "
				+ "employeeId= " + employeeId
				+ ", jobTitle= " + jobTitle + "]";
	}

	@Override
	int withdraw(int amount, int withdrawAmount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	int deposit(int amount, int depositAmount) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
	
}
