package collectionFramework.setImplementations.linkedHashSetDemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        //1. unique
        //2. null only once
        //3. homo as well as heterogeneous
        //4. insertion order is  maintained
        Set set = new LinkedHashSet();
        set.add(10);
        set.add(20);
        set.add("abc");
        set.add("abc");
        set.add(10);
        set.add(true);
        set.add(true);
        set.add(null);
        set.add(null);
        set.add(30);
        System.out.println(set);
    }
}
