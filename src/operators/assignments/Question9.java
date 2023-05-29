package operators.assignments;

public class Question9 {
    public static void main(String[] args) {
        //If the marks of Robert in three subjects are 78,45 and 62 respectively (each out of 100 ),
        // write a program to calculate his total marks and percentage marks.
        int subject1Marks = 78;
        int subject2Marks = 45;
        int subject3Marks = 62;
        int totalMarks = subject1Marks + subject2Marks + subject3Marks;
        System.out.println("Total marks " + totalMarks);

        float percentage = ((float)totalMarks / 300) * 100;

        System.out.println("Percentage Marks " + percentage);
    }
}
