package classComponents.assignements;

public class Triangle {
    int side1;
    int side2;
    int side3;

    int getPerimiter() {
        return side1 + side2 + side3;
    }

    double getArea() {
        return 0.5 * (side1 + side2 + side3);
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.side1 = 4;
        triangle.side2 = 5;
        triangle.side3 = 7;

        System.out.println("perimiter of Triangle " + triangle.getPerimiter());
        System.out.println("Area of Triangle " + triangle.getArea());

    }
}
