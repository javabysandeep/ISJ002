package classComponents;

public class BankAccount {
    int customerId;
    String customerName;
    float balance=200.0f;
    int phoneNumber;
    String email;
    static String bankName = "SBI";
    {
        System.out.println("instance block");
    }
    static {
        System.out.println("static block");
    }

    float deposit(float amountToBeDeposited){
       // float balance = 0;
        if (amountToBeDeposited > 0){
            this.balance = this.balance +  amountToBeDeposited;
        }
        return this.balance;
    }

}
