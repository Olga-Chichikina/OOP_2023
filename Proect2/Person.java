package homework.Proect2;

public class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

/**
     * Открыть двери
     * @param obj - используемый шкаф
     */
    public void open(Bookcase obj) {
        obj.open();
    }

    /**
     * Закрыть шкаф
     * @param obj - используемый шкаф
     */
    public void close(Bookcase obj) {
        obj.close();
    }

    /**
     * Взять книгу 
     * @param obj   - шкаф
     */
    public void take(Bookcase obj) {
        obj.take();
            System.out.println("Взяли книгу из шкафа");
    }

   }

    

