package collectionFramework.mapImplementations;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfEachCharacter {
    public static void main(String[] args) {
        String str = "collectionFramework";
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int index = 0; index < str.length(); index++) {
            char ch = str.charAt(index);
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            System.out.println(entry);
        }
    }
}
