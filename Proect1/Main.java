
public class Main {

    public static void main(String[] args) {
        Person galy = new Person("Галина", "50", Sex.woman);
        Person pavel = new Person("Павел", "52", Sex.man);
        Person misha = new Person("Миша", "25", Sex.man );
        Person vera = new Person("Вера", "49", Sex.woman );
        Person vova = new Person("Владимир", "60", Sex.man );
        Person artem = new Person("Артем", "18", Sex.man);
        Person sveta = new Person("Света","15", Sex.woman );

        GeoTree gt = new GeoTree();
        gt.append(galy, misha);
        gt.append(pavel, misha);
        gt.append(vera, artem);
        gt.append(vova, artem);
        gt.append(vera,sveta);
        gt.append(vova,sveta);

             
        System.out.println(new Reserch(gt).spend(vova,
                Relationship.parent));

        System.out.println(new Reserch(gt).spend(artem,
         Relationship.children ));  

        System.out.println(new Reserch(gt).searchAge());
    }
}
