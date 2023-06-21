package classComponents;

public class Product {
    int productId ;
    String productName ;
    int productPrice ;
    Product(){
        productId = 100;
        productName = "abc";
        productPrice = 1000;
        System.out.println("zero param constructor");
    }

    //parameterized constructor.
    Product(int productId, String productName, int productPrice){
        // assignment of local variables to the instance variables
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }
    void Product(){
        System.out.println("normal java method which same name as of class name with return type");
    }
    public static void main(String[] args) {
        Product product = new Product();//zero param constructor
        System.out.println(product.productId);
        System.out.println(product.productName);
        System.out.println(product.productPrice);

        Product product2 = new Product();//zero param constructor
        System.out.println(product2.productId);
        System.out.println(product2.productName);
        System.out.println(product2.productPrice);

        Product product3 = new Product(1, "Laptop",123000);//parameter
        System.out.println("product 3");
        System.out.println(product3.productId);
        System.out.println(product3.productName);
        System.out.println(product3.productPrice);
    }
}
