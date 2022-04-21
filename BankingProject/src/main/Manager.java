package main;

public class Manager extends Employee implements AccountActionsIMPL {
	// Slide 27 Java Classes, Inheritance 
	// fields
		private String timecards;
	
	public Manager() {
		
	};
	
	public Manager(String firstName, String lastName, int employeeId, String jobTitle, String timecards) {
		super(firstName, lastName, employeeId, jobTitle);
		this.timecards = timecards;
	}
	

	public String getTimecards() {
		return timecards;
	}

	public void setTimecards(String timecards) {
		this.timecards = timecards;
	}

	@Override
	public String toString() {
		return "Manager [timecards=" + timecards + ", "
				+ "firstName= " + getFirstName() + ", "
						+ "lastName= " + getLastName() + ", "
								+ "jobTitle= " + getJobTitle() + ", "
										+ "employeeId= " + getEmployeeId() + "]";
	}

	@Override
	public void withdraw(float amount, float withdrawAmount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit(float amount, float depositAmount) {
		// TODO Auto-generated method stub
		
	}

	public void PrintThis(int ...val) {
		for (int i : val) {
			System.out.println(i);
		}
	}
	
	
	
}
