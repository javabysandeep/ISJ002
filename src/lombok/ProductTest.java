package lombok;

public class ProductTest {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Laptop");
        Product product2 = new Product(1, "mobile");
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product1.equals(product2));
    }
}
