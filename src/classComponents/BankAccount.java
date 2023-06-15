package classComponents;

public class BankAccount {
    int customerId;
    String customerName;
    float balance;
    int phoneNumber;
    String email;
    static String bankName = "SBI";

    float deposit(float amountToBeDeposited){
        float balance = 0;
        if (amountToBeDeposited > 0){
            this.balance = + amountToBeDeposited;
        }
        return this.balance;
    }

}
