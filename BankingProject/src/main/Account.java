package main;

enum AccountTypes {
	CHECKING, SAVINGS, CREDIT
}

public class Account {

	AccountTypes accountTypes;

	public Account(AccountTypes accountTypes) {
		super();
		this.accountTypes = accountTypes;
	}

	public void chooseAccount() {
		switch (accountTypes) {
		case CHECKING:
			System.out.println("You chose a Credit Account");
			break;
		case SAVINGS:
			System.out.println("You chose a Savings Account");
			break;
		default:
			System.out.println("You chose a Checking Account");
			break;
		}
	}

}
