package collectionFramework.mapImplementations;

import java.util.HashMap;
import java.util.Map;

public class Demo2 {
    public static void main(String[] args) {
        //roll number --> student name
        //1 : A
        //2 : X
        //3 : Y

        Map<Integer, String> map = new HashMap<>();
        //adding an entry/row/record in the map[table]
        map.put(1, "Sandesh");
        map.put(3, "Lalit");
        map.put(7, "Heena");
        map.put(2, "Rohan");

        System.out.println("only keys " + map.keySet());
        System.out.println("only values " + map.values());
        System.out.println("get one record value using key  " + map.get(1));


    }
}
