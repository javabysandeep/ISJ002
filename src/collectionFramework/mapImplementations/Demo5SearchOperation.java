package collectionFramework.mapImplementations;

import java.util.LinkedHashMap;
import java.util.Map;

public class Demo5SearchOperation {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Sandesh");
        map.put(3, "Lalit");
        map.put(7, "Heena");
        map.put(2, "Rohan");

        System.out.println(map.containsKey(3));//true
        System.out.println(map.containsKey(33));//false

        System.out.println(map.containsValue("Rohan"));//true
        System.out.println(map.containsValue("Vaibhav"));//false

    }
}
