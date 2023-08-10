package collectionFramework.listImplementations.arraListDemo;

import java.util.ArrayList;
import java.util.List;

public class Demo1ArrayList {
    public static void main(String[] args) {
        //1. we can add homo, heterogeneous data
        //2. we can add number of elements. growable
        //3. we can add duplicate elements
        //4. we can maintain insertion order of elements


        // container object creation
        List list = new ArrayList();

        // add operation : adding one element in the container
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(null);
        list.add("string data");
        list.add(true);

        //reading all the elements from the container at once
        System.out.println(list);

        //getting the size of container: no. of elements present
        System.out.println("Size of arraylist container " + list.size());

        //to check if the container is empty or not
        System.out.println("Is arraylist container empty: " + list.isEmpty());

        //read the single element from the container
        System.out.println("Arraylist container element stored at index 0 is " + list.get(0));

        //search a single element in the container
        System.out.println("Element is present in arraylist "+list.contains("string data"));

        //remove a single element from the container
        System.out.println("Removed element "+list.remove("string data"));
        System.out.println(list);
    }
}
