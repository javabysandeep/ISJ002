package stringHandling;

public class Demo13Splitting {
    public static void main(String[] args) {
        String str = "Ajay,Vijay,Amitabh,Govinda,Salman";
        //delimiter : ,
        String[] words = str.split(",");
        String[] array = {"Ajay","Vijay", "Amitabh","Govinda","Salman"};
        for (int index = 0; index < words.length; index++) {
            System.out.println(words[index]);
        }

    }

}
