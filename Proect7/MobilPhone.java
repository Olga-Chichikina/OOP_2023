package Proect7;

public class MobilPhone  extends Model implements Emailable, BaseFoneable {

    public MobilPhone(String namePhone, int number) {
        super(namePhone, number);
       
    }

    @Override
    public void SendEMail() {
        System.out.println("to send message с MobilPhone");
        
    }

    @Override
    public void Call() {
        System.out.println("Call с MobilPhone");
        
    }

    @Override
    public void SendSMS() {
        System.out.println("to send SMS с MobilPhone");
        
    }

    @Override
    public String toString() {
        return "MobilPhone []";
    }
    
}
