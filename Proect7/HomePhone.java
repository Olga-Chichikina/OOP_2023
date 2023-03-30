package Proect7;

public class HomePhone extends Model implements BaseFoneable  {

        
    public HomePhone(String namePhone, int number) {
        super(namePhone, number);
       
    }

    @Override
    public String toString() {
        return "HomePhone []";
    }

    @Override
    public void Call() {
        System.out.println("Call on homePhone");
        
    }

    @Override
    public void SendSMS() {
        System.out.println("to send SMS с homePhone");
    }
    
}
