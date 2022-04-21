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
		
		
		Box<Integer> intBox = new Box<Integer>();
		intBox.add(333);
		intBox.add(343);
		intBox.add(323);
		intBox.add(313);
		intBox.add(33);
		
		System.out.println(intBox.get());
		
		Box<String> strBox = new Box<String>();
		
				strBox.add("duck");
				strBox.add("chicken");
				strBox.add("horse");
				strBox.add("cow");
				strBox.add("pig");
				
		System.out.println(strBox.get());
		
	}

}
