package Proect5;

public class Logir implements Calculable {
    private Calculable calc;
    private Loggirable loggir;

    public Logir(Calculable calc, Loggirable loggir) {
        this.calc = calc;
        this.loggir = loggir;
    }

    @Override
    public Calculable sum(int arg) {
        Calculable result = calc.sum(arg);
        loggir.logg(" Summ  ");
        return result;
    }

    @Override
    public Calculable multiplication(int arg) {
        Calculable result = calc.multiplication(arg);
        loggir.logg(" Multiplication  ");
        return result;
    }

    @Override
    public Calculable difference(int arg) {
        Calculable result = calc.difference(arg);
        loggir.logg("Difference   ");
        return result;
    }

    @Override
    public Calculable division(int arg) {
        Calculable result = calc.division(arg);
        loggir.logg("Division   ");
        return result;
    }

    @Override
    public int getResult() {
        int result = calc.getResult();
        loggir.logg("Result  ");
        return result;

    }
  
}
