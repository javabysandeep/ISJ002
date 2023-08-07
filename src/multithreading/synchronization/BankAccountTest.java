package multithreading.synchronization;

public class BankAccountTest {
    public static void main(String[] args) throws InterruptedException {
        BankAccount bankAccount = new BankAccount();
        bankAccount.accountNumber = 101;
        bankAccount.balance= 200000;

        Thread atm = new Thread(()->{
            for (int i = 1; i <=100000 ; i++) {
                bankAccount.withdraw(1);
            }
        }, "atm");
        Thread upi = new Thread(()->{
            for (int i = 1; i <=100000 ; i++) {
                bankAccount.withdraw(1);
            }
        }, "upi");

        atm.start();
        upi.start();

        atm.join();
        upi.join();

        System.out.println("Available balance "+bankAccount.balance);

    }
}
