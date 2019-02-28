

public class StaticExample {
	
	
	
	public static void main(String[] args) {
		
				
		// Create account object for John
		Account johnAccount = new Account("John", 1020473, 1589.39);
		// Create account object for Mary
		Account maryAccount = new Account("Mary", 1020473, 1590.39);
		
		// Set the account fee
		Account.fee = 12.40;
		
		// Display account fees
		System.out.println("John's fee: " + johnAccount.fee);
		System.out.println("Mary's fee: " + maryAccount.fee);
		
		// Change account fee
		Account.fee = 6.20;
		
		// Display account fees again
		System.out.println("John's fee: " + johnAccount.fee);
		System.out.println("Mary's fee: " + maryAccount.fee);
		
		System.out.println(johnAccount.personName + " " +johnAccount.accountNumber + " " + Account.fee + " " + johnAccount.balance);
		
		
		//test for github
	}
}

	
			 
