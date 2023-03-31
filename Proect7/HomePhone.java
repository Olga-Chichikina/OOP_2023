

public class HomePhone extends Model implements Callable  {

        
    public HomePhone(String namePhone, int number) {
        super(namePhone, number);
       
    }
    
    @Override
    public void call(int outNumber) {
        System.out.println("Вызываю номер " + outNumber);
        
    }
    @Override
    public void ring(int inputNumber) {
        System.out.println("Вам звонит абонент " + inputNumber);
    }

}
