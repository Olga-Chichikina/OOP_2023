

public class MobilPhone  extends Model implements Emailable, Callable,Sendable {

    public MobilPhone(String namePhone, int number) {
        super(namePhone, number);
       
    }

    @Override
    public String getNamePhone() {
        return super.getNamePhone();
    }

    @Override
    public int getNumber() {
        return super.getNumber();
    }

    @Override
    public void sendEMail() {
        System.out.println("to send message с MobilPhone");
        
    }

    @Override
    public void call(int number) {
        System.out.println("Вызываю номер " + number);
        
    }

    @Override
    public void send() {
        System.out.println("to send SMS с MobilPhone");
        
    }

    @Override
    public String toString() {
        return "MobilPhone ";
    }
    @Override
    public void ring(int inputNumber) {
        System.out.println("Вам звонит абонент " + inputNumber);
}
}
