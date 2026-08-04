/* 
Scenario 1 – ATM Withdrawal

Develop an ATM withdrawal system.

Requirements

- Validate the PIN.
- Check whether the withdrawal amount is greater than zero.
- Check whether the amount is a multiple of 100.
- Ensure sufficient account balance.
- Deduct the amount and display the remaining balance.

int corrent_pin = 6789;
int entered_pin = 6789;
int withdrawal_amount = 500;
int current_amount = 20000;
int remaining_balance = 0;
if(corrent_pin == entered_pin){

if(withdrawal_amout > 0){
    if( withdrawal_amount  %  100 ==0 ){
        if(current_amount <= withdrawal_amount){
              remaining_balance =  current_amount - withdrawal_amount;
              System.out.println("Remaining Balance :"+remaining_balance);
        }
    }
}
else{
    System.out.println("please entered amount greater than zero");
    }
}

*/

public class ATM1 {
    public static void main(String[] args) {
        Hello1 obj = new Hello1();
        obj.hi1();
    }
}
class Hello1{
    void hi1(){
        int Corrent_pin = 5678;
        int Entered_pin = 5678;
        int withdrawal_amount = 120000;
        int current_amount = 20000;
        int remaining_balance = 0 ;
        if(Corrent_pin == Entered_pin){
            if( withdrawal_amount<= current_amount){
                remaining_balance = current_amount - withdrawal_amount;
                System.out.println("Remaining_balance: "+remaining_balance);
            }
        }
        else{
            System.out.println("Invalid PIN");
        }
    }
}