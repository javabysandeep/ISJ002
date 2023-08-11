package collectionFramework.setImplementations.treeSetDemo;

import java.util.Set;
import java.util.TreeSet;

public class Demo6String {
    public static void main(String[] args) {
        Set<String> strings = new TreeSet<>();
        strings.add("good morning");
        strings.add("hello");
        strings.add("ola");
        strings.add("hi");
        strings.add("abc");
        System.out.println(strings);
    }
}
