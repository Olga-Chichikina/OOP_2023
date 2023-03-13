package homework.Proect2;

public class Closet {
    private String name;
    protected String object;

    public Closet (){
    }

    public Closet(String name, String object){
        this.name = name;
        this.object = object;
    }
   
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
       return this.name;
    }

    public String open(){
        return "шкаф для  " + this.name + " открыт" ;
    }
    public String put (){
        return " Положи "+ object;
    }


    public String close(){
        return "шкаф для " + this.name + " закрыт" ;
    }

    public String getObject() {
        return object;
    }
}



