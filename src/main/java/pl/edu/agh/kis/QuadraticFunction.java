package pl.edu.agh.kis;

/**
 * Created by Karl on 08.01.2017.
 */
public class QuadraticFunction {
    private int a;
    private int b;
    private int c;

    public QuadraticFunction(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getD() {
        return c;
    }

    public int countValueInGivenArgument(int x) {
        return a * x * x + b * x + c;
    }

}
