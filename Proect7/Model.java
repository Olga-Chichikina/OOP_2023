
import java.time.LocalDateTime;

public abstract class Model {
    String namePhone;
    int number;
    
    public Model() {    }

    public Model(String namePhone, int number) {
        this.namePhone = namePhone;
        this.number = number;
    }

    public void setNamePhone(String namePhone) {
        this.namePhone = namePhone;
    }

    public String getNamePhone() {
        return namePhone;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    public String add(String namePhone, int number ){
        return namePhone +"  "+ "  номер  " + number +
           "дата добавления телефона :  " + LocalDateTime.now() ;
    }
    public abstract void call(int outputNumber); 
    
} 

