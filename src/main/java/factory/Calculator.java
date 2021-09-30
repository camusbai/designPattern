package factory;

public class Calculator {

    public static void main(String[] args) {
        double inputA = 1.2;
        double inputB = 4.2;

        double result = new Calculator().calculate(inputA, inputB, addition);
        System.out.println(result);

        result = new Calculator().calculate(inputA, inputB, reduction);
        System.out.println(result);
    }

    double calculate(double a, double b, Operand operand) {
        return operand.calculate(a, b);
    }

    static Operand addition = (a, b) -> a + b;
    static Operand reduction = (a, b) -> a - b;

    interface Operand {
        double calculate(double a, double b);
    }
}
