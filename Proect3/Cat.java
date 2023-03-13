package homework.Proect3;

public class Cat {
    private String nameCat;

    public Cat (String nameCat){
        this.nameCat = nameCat;
    }

    public String getNameCat() {
        return nameCat;
    }

    public void setNameCat(String nameCat) {
        this.nameCat = nameCat;
    }

    public String voice(){
        return "Кошка" + this.nameCat + "говорит МЯУ" ;
    }
    public String voice1(){
        return "Кошка" + this.nameCat + "говорит МУР" ;
    }   
    @Override
    public String toString() {
        return this.nameCat;
    }
    
}
