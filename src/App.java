public class App {

	public static void main(String[] args) {

	//Step 3
	double itemPrice = 20.00;
	float priceItem = 20.00f;
	//f needed to designate float?
	
	double moneyWallet = 50.00;
	short walletMoney = 50;
	
	int numberFriends = 10;
	short friendsNumber = 10;
	
	byte ageYears = 22;
	short yearsAge = 22;
	
	String firstName = "Renee";
	boolean isFNameRenee = true;
	
	String lastName = "Dubuc";
	boolean isLNameDubuc = true;
	
	char middleInitial = 'A';
	boolean isMInitialA = true;
	
	System.out.println("Item price is: " + '$' + itemPrice);
	System.out.println("Item price is: " + '$' + priceItem);
	System.out.println("Amount of money in wallet is: " + '$' + moneyWallet);
	System.out.println("Amount of money in wallet is: " + '$' + walletMoney);
	System.out.println("Number of friends is: " + numberFriends);
	System.out.println("Number of friends is: " + friendsNumber);
	System.out.println("My age in years is: " + ageYears);
	System.out.println("My age in years is: " + yearsAge);
	System.out.println("My first name is: " + firstName);
	System.out.println("Is your first name Renee? " + isFNameRenee);
	System.out.println("My last name is: " + lastName);
	System.out.println("Is your last name Dubuc? " + isLNameDubuc);
	System.out.println("My middle initial is: " + middleInitial);
	System.out.println("Is your middle initial A? " + isMInitialA);
	
	/*System.out.println(itemPrice + priceItem + moneyWallet + walletMoney + numberFriends + friendsNumber +
	 * ageYears + yearsAge + firstName + isFNameRenee + lastName + isLNameDubuc + middleInitial + isMInitialA);
	results in 204.0ReneetrueDubuctrueAtrue
	I understand why it did this, but how can I print out multiple variables in the same print line?*/
	
	
	//Step 4
	double difference = moneyWallet - itemPrice;
	System.out.println("After purchase, I still have: " + '$' + difference);
	
	int average = yearsAge / friendsNumber;
	//This didn't work as short average even though yearsAge and friendsNumber are both short, why?
	System.out.println("I made this many friends every year: " + average);
	int remainder = yearsAge / friendsNumber;
	System.out.println("With a remainder of this many friends: " + remainder);
	
	String fullname = firstName + " " + middleInitial + " " + lastName;
	System.out.println("My full name is: " + fullname);
	}

}
