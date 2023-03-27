
    public final class Calculator implements Calculable {

        private double ax;
        private double ay;
        private double bx;
        private double by;
        private double argD;
        private double argM;

 
        public Calculator(double ax, double ay, double bx, double by,double argD, double argM) {
            this.ax = ax;
            this.ay = ay;
            this.bx = bx;
            this.by = by;
            this.argD = argD;
            this.argM = argM;

        }
        //   public void set(double ax){
        //         this.ax=ax;
        //   }
        //   public void set(double ay){
        //     this.ay=ay;
        //   }
        //  public void set(double bx){
        //     this.bx=bx;
        //  }   
        //  public void set(double by){
        //     this.by=by;
        // }       
        public double getax() {
            return ax;
        }
        public double getay() {
            return ay;
        }
        public double getbx() {
            return bx;
        }
        public double getby() {
            return by;
        }
        public double getargM() {
            return argM;
        }
        public double getargD() {
            return argD;
        }

        @Override
        public Calculable sum(double ax, double ay, double bx, double by) {
            argD = ax + bx;
            argM = ay + by;
            return this;
        }
    
        @Override
        public Calculable multiplication(double ax, double ay, double bx, double by) {
            argD = ax*ay - ay*by;
            argM = ay*bx + ax*by;
            return this;
        }
    
        @Override
        public Calculable difference(double ax, double ay, double bx, double by) {
            argD = ax - bx;
            argM = ay - by;
            return this;
        }

        @Override
        public Calculable division(double ax, double ay, double bx, double by) {
            argD = (ax*ay + ay*by)/(bx*bx + by*by);
            argM = (ay*bx - ax*by)/(bx*bx + by*by);
            return this;
        }

        @Override
        public String getResult() {
            return (argD +"  + "+ argM +"i   ");
           
        }
    }

