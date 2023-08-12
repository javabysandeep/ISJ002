package collectionFramework.cursors;

import java.util.*;

public class Demo4Enumeration {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(100);
        vector.add(600);
        vector.add(700);
        vector.add(300);
        vector.add(300);
        //using enumeration we can only retrieve the elements from the vector, stack and legacy classes
        Enumeration<Integer> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

    }
}
