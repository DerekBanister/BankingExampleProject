package main;

public class Manager extends Employee{
		
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
		return "Manager [timecards=" + timecards + "]";
	}

	
	
	
	
}
