package main;


public class Main {

	public static void main(String[] args) {
		// slides 14,10,8 for object/memory
		Employee empOne = new Employee("John", "Smith", 1, "Dev");
		Employee empTwo = new Employee("Jim", "Doe", 2, "Janitor");
		Employee empThree = new Employee("Jim", "Doe", 2);
		
		Manager mang1 = new Manager("Erik", "Taylor", 3, "Manager", "Yes");
		

		
		System.out.println(empOne);
		System.out.println(empTwo);
		System.out.println(empThree);
		System.out.println(mang1);
	}

}
