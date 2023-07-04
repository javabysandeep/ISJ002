package oops.revision;

public class LoanTest {
    public static void main(String[] args) {
        System.out.println("case 1 : parent class");
        //only present in parent : parent
        //only present in child : CTE
        //present in both parent and child : parent
        Loan loan = new Loan();
        System.out.println(loan.id);
        System.out.println(loan.amount);
        System.out.println(loan.borrowerName);
        System.out.println(loan.rateOfInterest);


        System.out.println("case 2 : child class");
        //only present in parent : parent
        //only present in child : child
        //present in both parent and child : child
        PersonalLoan personalLoan = new PersonalLoan();

        System.out.println(personalLoan.id);
        System.out.println(personalLoan.amount);
        System.out.println(personalLoan.borrowerName);
        System.out.println(personalLoan.rateOfInterest);

        System.out.println("third case");
        //only present in parent : parent
        //only present in child : CTE
        //present in both parent and child : Variable : Parent  [methods -child]
        Loan loanPersonal = new PersonalLoan();

        System.out.println("fourth case : CTE");
        //PersonalLoan personalLoan1 = new Loan();

    }
}
