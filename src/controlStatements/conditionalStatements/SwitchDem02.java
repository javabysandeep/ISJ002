package controlStatements.conditionalStatements;

public class SwitchDem02 {
    public static void main(String[] args) {
        char ch = 'J';
        switch (ch) {
            case 'J':
                System.out.println("Jan");
                break;
            case 'F':
                System.out.println("Feb");
                break;
            case 'M':
                System.out.println("March");
                break;
            case 'A':
                System.out.println("April");
                break;
            case 'm':
                System.out.println("May");
                break;
            default:
                System.out.println("invalid month number");
                break;
        }
    }
}
