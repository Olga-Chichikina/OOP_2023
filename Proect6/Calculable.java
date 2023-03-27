
public interface Calculable {
    Calculable sum(double ax, double ay, double bx, double by);
    Calculable multiplication(double ax, double ay, double bx, double by);
    Calculable difference(double ax, double ay, double bx, double by);
    Calculable division(double ax, double ay, double bx, double by);
    String getResult();
  
}
