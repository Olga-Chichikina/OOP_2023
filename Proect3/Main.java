package homework.Proect3;

public class Main {
    public static void main (String[] args) {
        Person masha = new Person("Маша");
        Cat tisha = new Cat("Тишка");

        System.out.println(masha.voice());
        System.out.println(tisha.voice());
        System.out.println(masha.voice1());
        System.out.println(tisha.voice1());

    }
}
