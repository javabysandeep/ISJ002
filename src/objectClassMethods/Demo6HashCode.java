package objectClassMethods;

public class Demo6HashCode {
    public static void main(String[] args) {
        Student student = new Student();
        int hashCode = student.hashCode();
        System.out.println("Hashcode in Decimal number system " + hashCode);
        System.out.println("Hashcode in hexa decimal number system " + Integer.toHexString(hashCode));
        System.out.println("get class method " + student.getClass().getName());

        System.out.println(student.getClass().getName() + "@" + Integer.toHexString(hashCode));
        System.out.println(student);
        System.out.println(student.toString());
    }
}
