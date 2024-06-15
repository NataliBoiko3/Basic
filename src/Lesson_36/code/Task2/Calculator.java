package Lesson_36.code.Task2;

public class Calculator {
    public Number add(Number x, Number y) {
    return x.doubleValue() + y.doubleValue();
}

    public Number subtract(Number x, Number y) {
        return x.doubleValue() - y.doubleValue();
    }

    public Number multiply(Number x, Number y) {
        return x.doubleValue() * y.doubleValue();
    }


    public Number divide(Number a, Number b) {
        if (b.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a.doubleValue() / b.doubleValue();
    }

}
