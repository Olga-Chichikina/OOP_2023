
public class Logir implements Calculable {
    private Calculable calc;
    private Loggirable loggir;

    public Logir(Calculable calc, Loggirable loggir) {
        this.calc = calc;
        this.loggir = loggir;
    }

    @Override
    public Calculable sum(double ax, double ay, double bx, double by) {
        Calculable result = calc.sum(ax, ay, bx, by);
        loggir.logg(" Summ  ");
        return result;
    }

    @Override
    public Calculable multiplication(double ax, double ay, double bx, double by) {
        Calculable result = calc.multiplication(ax, ay, bx, by);
        loggir.logg(" Multiplication  ");
        return result;
    }

    @Override
    public Calculable difference(double ax, double ay, double bx, double by) {
        Calculable result = calc.difference(ax, ay, bx, by);
        loggir.logg("Difference   ");
        return result;
    }

    @Override
    public Calculable division(double ax, double ay, double bx, double by) {
        Calculable result = calc.division(ax, ay, bx, by);
        loggir.logg("Division   ");
        return result;
    }

    @Override
    public String getResult() {
        loggir.logg("Result  ");
        return calc.getResult();

    }
  
}