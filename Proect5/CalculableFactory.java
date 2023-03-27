package Proect5;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(int primaryArg) {
        return new  Logir(new Calculator(primaryArg), new LoggirTerm());


    }
    
}

