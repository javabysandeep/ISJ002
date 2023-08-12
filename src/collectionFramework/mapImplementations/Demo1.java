package collectionFramework.mapImplementations;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {
        //roll number --> student name
        //1 : A
        //2 : X
        //3 : Y

        Map map = new HashMap();
        //adding an entry/row/record in the map[table]
        map.put(1, null);
        map.put(2, null);
        map.put(3, "A");
        map.put(true, "A");
        map.put(4, "A");
        map.put(null, "z");
        map.put(null, "A");

        System.out.println(map);
        System.out.println("Size of Map " + map.size());

    //hashset properties = hashmap key
        //1. unique key
        //2. null only once
        //3. homogeneous as well as heterogeneous
        //4. no insertion order is maintained

    }
}
