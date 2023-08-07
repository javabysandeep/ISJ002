package multithreading.synchronization;

public class BankAccount {
    int accountNumber;
    float balance;

   synchronized public void deposit(float balance) {
        if (balance > 0) {
            this.balance += balance;
        }
    }

    synchronized public void withdraw(float amount) {
        if (balance >= amount) {
            this.balance -= amount;
        }
    }
}
