
    public class CalculableFactory implements ICalculableFactory {

       private double argM;
       private double argD;
       public Calculable create( double ax,double ay, double bx, double by){
            return new Calculator( ax, ay, bx, by, argD, argM);
        }
    }


