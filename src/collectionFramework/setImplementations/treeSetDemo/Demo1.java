package collectionFramework.setImplementations.treeSetDemo;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {
    public static void main(String[] args) {
        //1. we can store unique
        //2. we cannot store null even once
        //3. we can store only homogeneous
        //4. Sorting order is maintained
        // for sorting purpose elements must be of same type.

        Set set = new TreeSet();
        set.add(11);
        set.add(1);
        set.add(2);
        set.add(22);
        set.add(30);
        set.add(30);
        /*set.add("abc");
        set.add("abc");
        set.add(true);
        set.add(true);
        set.add(null);
        set.add(null);*/
        System.out.println(set);
    }
}
