package collectionFramework.mapImplementations;

import java.util.*;

public class Demo3LinkedHashMap {
    public static void main(String[] args) {
        //insertion order

        //roll number --> student name
        //1 : A
        //2 : X
        //3 : Y

        Map<Integer, String> map = new LinkedHashMap<>();
        //adding an entry/row/record in the map[table]
        map.put(1, "Sandesh");
        map.put(3, "Lalit");
        map.put(7, "Heena");
        map.put(2, "Rohan");
        Set<Integer> rollNumbers = map.keySet();
        for (Integer rollNumber : rollNumbers) {
            System.out.println(rollNumber);
        }

        System.out.println("printing values");
        Collection<String> studentNames = map.values();
        for (String studentName : studentNames) {
            System.out.println(studentName);
        }

        //reading the key and value together
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }

    }
}
