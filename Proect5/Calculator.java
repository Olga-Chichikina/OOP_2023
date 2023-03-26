package Proect5;

public final class Calculator implements Calculable {

    private int primaryArg;

    public Calculator(int primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public Calculable sum(int arg) {
        primaryArg += arg;
        return this;
    }

    @Override
    public Calculable multiplication(int arg) {
        primaryArg *= arg;
        return this;
    }
    

    @Override
    public int getResult() {
        return primaryArg;
    }

    @Override
    public Calculable difference(int arg) {
        primaryArg -= arg;
        return this;
    }

    @Override
    public Calculable division(int arg) {
        primaryArg /= arg;
        return this;
}
}

