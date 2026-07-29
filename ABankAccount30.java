public class ABankAccount30 {
    long accountNumber;
    String accountHolderName;
    double balance;
    static String bankName = "Indian Bank";

    void displayBankName() {
        System.out.println("bankName ="+ bankName);
    }

    void setAccountDetails(long number, String name, double amount) {
        accountNumber = number;
        accountHolderName = name;
        balance = amount;
    }

    double getBalance() {
        return balance;
    }

    double deposit(double depositAmount) {
        balance = balance + depositAmount;
        return balance;
    }

    void displayAccountDetails(){
        System.out.println("accountNumber ="+accountNumber);
        System.out.println("accoutHolderName ="+accountHolderName);
        System.out.println("balance ="+balance);
    }

    public static void main(String[] args) {
        ABankAccount30 obj = new ABankAccount30();
        System.out.println("displaybankname ------------------");
        obj.displayBankName();
        System.out.println("setaccountdetails -------------------");
        obj.setAccountDetails(989878787, "ahdfief", 51000);
        double bal = obj.getBalance();
        System.out.println("balance ------------------- ");
        System.out.println("balance =" + bal);
        System.out.println("depositamout + balance +------------------");
        double a = obj.deposit(5000);
        System.out.println("balance = " + a);
        System.out.println("displayaccountdetails --------------------");
        obj.displayAccountDetails();
    }
}