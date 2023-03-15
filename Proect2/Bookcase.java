package homework.Proect2;

public class Bookcase extends Closet  {

    private boolean door;

    /**
     * @param name           - имя шкафа или примечание
     */
    public Bookcase(String name) {

        this.door = false;
        this.name = name;
        System.out.println("У нас есть "+ name + " шкаф");
    }

    /**
     * открываем двери
     */
    public void open() {
        door = true;
        System.out.printf("Двери открыли в шкафу  ",name );
    }

    /**
     * закрываем двери
    */
    public void close() {
        door = false;
        System.out.printf("Двери шкафа закрыли" );
    }

    /**
     * взять книгу из шкафа
    */
    public String take() {
        if (door == false){
            return "Закрыли шкаф" ;
        }
        if (door == true ) {
            return "Возьмите книгу из шкафа ";
        }
        return null;
    }
        
   }

//     public Bookcase() {
//     }

//     public Bookcase(String name, String object) {
//         super(name, object);
//     }
      
    
// }
