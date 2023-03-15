package homework.Proect2;

public class Main {
    public static void main(String[] args) {
        Person man = new Person ("Виктор");
        Bookcase book = new Bookcase("книжный");
        man.open(book);
        System.out.println(" ");
        man.take(book);
        // System.out.println(" ");
        man.close(book);
    }
}
