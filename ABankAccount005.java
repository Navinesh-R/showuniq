//bank account details
class ABankAccount005
{
	long accountNumber;
	String accountHolderName;
	double balance;
	void displayAccountDetails()
	{
		System.out.println("accountNumber "+accountNumber);
		System.out.println("balance "+balance);
		System.out.println("accountHolderName "+accountHolderName);
	}
	public static void main(String []args){
		ABankAccount005 obj = new ABankAccount005();
		obj.accountNumber = 1111111111;
		obj.accountHolderName = "navinesh";
		obj.balance = 5112;
		obj.displayAccountDetails();
	}
}