package controlStatements.conditionalStatements;

public class Demo8MaximumMinimum {
    public static void main(String[] args) {
        /*Take input of age of 3 people by user and determine oldest and youngest among them.
         * */
        int person1Age = 78;
        int person2Age = 98;
        int person3Age = 56;
        int oldest;

      /*  if (person1Age > person2Age && person1Age > person3Age) {
            oldest = person1Age;
        } else if (person2Age > person1Age && person2Age > person3Age) {
            oldest = person2Age;
        } else {
            oldest = person3Age;
        }*/
        oldest = person1Age > person2Age && person1Age > person3Age ? person1Age :
                person2Age > person1Age && person2Age > person3Age ? person2Age : person3Age;

        int youngest;
     /*   if (person1Age < person2Age && person1Age < person3Age) {
            youngest = person1Age;
        } else if (person2Age < person1Age && person2Age < person3Age) {
            youngest = person2Age;
        } else {
            youngest = person3Age;
        }*/
        youngest = person1Age < person2Age && person1Age < person3Age ? person1Age :
                person2Age < person1Age && person2Age < person3Age ? person2Age : person3Age;

        System.out.println("Youngest " + youngest);
        System.out.println("Oldest " + oldest);

    }
}
