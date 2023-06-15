package classComponents;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(100.0f);
        System.out.println(bankAccount.balance);
    }
}
