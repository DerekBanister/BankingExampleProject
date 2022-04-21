package main;
	// ABSTRACTION
public abstract class AbstractAccountActions {
		String bankAccount;
		
		public AbstractAccountActions() {
			
		}
		
		public AbstractAccountActions(String bankAccount) {
			this.bankAccount = bankAccount;
		}
		
		
		
		
		
		
		abstract int withdraw(int amount, int withdrawAmount);
		abstract int deposit(int amount, int depositAmount);
		
		public String getBankAccount() {
			return bankAccount;
		}
}
