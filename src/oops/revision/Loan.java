package oops.revision;

//parent , base, super : define common data and methods
public class Loan {
    int id=1;
    int amount=1;
    int rateOfInterest=1;
    String borrowerName="Parent";

    int getOutstandingAmount() {
        return amount;
    }

    int getLoanId() {
        return id;
    }

}
