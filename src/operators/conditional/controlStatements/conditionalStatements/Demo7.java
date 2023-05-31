package operators.conditional.controlStatements.conditionalStatements;

public class Demo7 {
    public static void main(String[] args) {
        /*
        A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
        Ask user for quantity
        Suppose, one unit will cost 100.
            Judge and print total cost for user.
        * */
        int quantity = 5000;
        float price = 100.0f;

        float total = quantity * price;
        float discount = 0.0f;
        if (quantity > 1000) {
            discount = total * 0.1f;
        }
        float totalPayable = total - discount;
        System.out.println("Total discount " + discount);
        System.out.println("Total payable amount " + totalPayable);
    }
}
