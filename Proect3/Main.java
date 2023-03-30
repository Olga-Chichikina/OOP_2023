package Proect3;

public class Main {
    public static void main (String[] args) {

        Home home = new Home();
        Person woman = new Person ("Маша", Sex.woman, 36);
        Animal cat = new Cat("Тишка", Sex.man, 3);


        home.addAnimal(cat ).addAnimal(woman);

        for (Animal an: home.getAnimals()) {
            System.out.println(an);
            System.out.println(an.speak());
        }

        System.out.println("Sound of the Home");
                
        woman.call_cat(cat);
        System.out.println("  ");
        woman.feed_to_cat(cat, 10);
        System.out.println("  ");
        woman.petting_a_cat(cat);
         
       
    }
 }
