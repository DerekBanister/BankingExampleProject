package main;


public class Main {

	public static void main(String[] args) {
		// slides 14,10,8 for object/memory
		Employee empOne = new Employee("John", "Smith", 1, "Dev");
		System.out.println(empOne.withdraw(200, 50));
		Employee empTwo = new Employee("Jim", "Doe", 2, "Janitor");
		Employee empThree = new Employee("Bob", "David", 2);
		
		Manager mang1 = new Manager();
		mang1.setFirstName("Doug");
		mang1.setLastName("Banny");
		mang1.setJobTitle("VIP");
		mang1.setEmployeeId(4);
		mang1.setTimecards("No");

		
		System.out.println(empOne);
		System.out.println(empTwo);
		System.out.println(empThree);
		System.out.println(mang1);
	}

}
