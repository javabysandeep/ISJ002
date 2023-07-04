package oops.finalKeyword;

public final class Student {
    private final int id;
    private final String name;
    public final static String COLLEGE_NAME =" Pune university";//constant

   /* static {
       collegeName = "Pu";
    }*/

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


}
