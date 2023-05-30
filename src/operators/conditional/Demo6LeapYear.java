package operators.conditional;

public class Demo6LeapYear {
    public static void main(String[] args) {
        //leap year: 2000, 2020, 2400
        //not a leap year: 2023, 2100
        int year = 2100;
        boolean isLeapYear = (year % 400 == 0) ||
                (year % 100 != 0 && year % 4 == 0);

        System.out.println(isLeapYear ? "Its leap year" : "its not a leap year");


    }
}
