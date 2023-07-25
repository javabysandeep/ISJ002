package objectClassMethods;

public class EqualsHashCodeContract {
    public static void main(String[] args) {
        Product product1 = new Product(1,"laptop");
        Product product2 = new Product(1,"laptop");
        System.out.println(product1.equals(product1));//true

        Student student = new Student();
        System.out.println(product1.equals(student));//false

        System.out.println("As per equals method");
        System.out.println(product1.equals(product2));//true
        System.out.println(product1.hashCode()+"\t"+product2.hashCode());

    }
}
