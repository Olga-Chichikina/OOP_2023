package homework.Proect3;

public class Main {
    public static void main (String[] args) {
        Person woman = new Person ("Маша", Sex.woman, 36);
        Animal cat = new Cat("Тишка", Sex.man, 3);
        
        woman.call_cat(cat);
        System.out.println("  ");
        woman.feed_to_cat(cat, 10);
        System.out.println("  ");
        woman.petting_a_cat(cat);
       
    }
 }
