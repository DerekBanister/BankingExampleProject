package main;
	// ABSTRACTION
public abstract class AbstractAccountActions {
		String bankAccount;
		
		public AbstractAccountActions() {
			
		}
		
		public AbstractAccountActions(String bankAccount) {
			System.out.println("constructor from abstract class");
			this.bankAccount = bankAccount;
		}
		
		
		
		
	
		abstract double withdraw(int amount, int withdrawAmount);
		abstract int deposit(int amount, int depositAmount);
		
		public String getBankAccount() {
			return bankAccount;
		}
}
