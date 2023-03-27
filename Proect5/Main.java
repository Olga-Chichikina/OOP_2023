package Proect5;

    //  Calculator для рациональных чисел.С логированием.
public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new CalculableFactory();
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();

    }
}
  
        
   