package homework.Proect2;

public class Main {
    public static void main(String[] args) {
        Dresser dresser = new Dresser("Одежды", "платье");
        System.out.println(dresser.open());
        System.out.println(dresser.put());
        System.out.println(dresser.close());
        System.out.println();
        Bookcase bookcase = new Bookcase("книг", "книгу");
        System.out.println(bookcase.open());
        System.out.println(bookcase.put());
        System.out.println(bookcase.close());
        System.out.println();
        Cupboard cupboard = new Cupboard("посуды", "стакан");
        System.out.println(cupboard.open());
        System.out.println(cupboard.put());
        System.out.println(cupboard.close());
       
    }
}
