
public class Main {

    public static void main(String[] args) {
        Person galy = new Person("Галина", "50");
        Person pavel = new Person("Павел", "52");
        Person misha = new Person("Миша", "25");
        Person vera = new Person("Вера", "49");
        Person vova = new Person("Владимир", "60");
        Person artem = new Person("Артем", "18");
      
        GeoTree gt = new GeoTree();
        gt.append(galy, misha);
        gt.append(pavel, misha);
        gt.append(vera, artem);
        gt.append(vova, artem);
        
        System.out.println(new Reserch(gt).spend(vova,
                Relationship.parent));

        System.out.println(new Reserch(gt).spend(artem,
         Relationship.children ));  

        System.out.println(new Reserch(gt).searchAge());
    }
}
