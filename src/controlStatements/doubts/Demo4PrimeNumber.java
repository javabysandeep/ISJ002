package controlStatements.doubts;

public class Demo4PrimeNumber {
    public static void main(String[] args) {
        int number  = 100;
        boolean isPrime = true;
        //1,number
        for (int i = 2; i <=number/2 ; i++) {
            if(number%i==0){
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime?"its prime":"its not a prime");
    }
}
