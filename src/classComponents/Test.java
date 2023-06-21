package classComponents;

public class Test {
    public static void main(String[] args) {
        //printValue(100);//method call, method invokation
        Test.printValue(100);//method call, method invokation

        //deposit
        BankAccount bankAccount = new BankAccount();
         bankAccount.deposit( 100.5f);
        System.out.println("updated balance "+bankAccount.balance);
    }

    // method definition
    static void printValue(int number) {
        System.out.println("printing....." + number);
    }
}
