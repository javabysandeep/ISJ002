package collectionFramework;

public class Demo1 {
    public static void main(String[] args) {
        ArrayListCustom arrayListCustom = new ArrayListCustom();
        arrayListCustom.add("string handling");
        arrayListCustom.add(20);
        arrayListCustom.add(30);
        arrayListCustom.add(40);
        arrayListCustom.add(50);
        arrayListCustom.add(60);
        arrayListCustom.add(70);
        arrayListCustom.add(80);
        arrayListCustom.add(90);
        arrayListCustom.add(100);
        arrayListCustom.add(110);
        arrayListCustom.add(120);
        arrayListCustom.add(130);
        arrayListCustom.add(140);
        arrayListCustom.add(150);
        arrayListCustom.add(160);
        arrayListCustom.add(170);
        arrayListCustom.add(180);
        arrayListCustom.add(190);
        arrayListCustom.add(200);
        arrayListCustom.add(210);
        System.out.println("Array size " + arrayListCustom.size);
        System.out.println("Array capacity " + arrayListCustom.capacity);

        for (int i = 0; i < arrayListCustom.size; i++) {
            System.out.println(arrayListCustom.get(i));
        }

    }
}
