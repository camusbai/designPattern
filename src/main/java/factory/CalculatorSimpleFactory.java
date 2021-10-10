package factory;

public class CalculatorSimpleFactory {
    public static void main(String[] args) {
        Double input1 = 2.2;
        Double input2 = 5.5;

        Double result = new CalculatorSimpleFactory().build("+").calculate(input1, input2);
        System.out.println(result);
    }

    ICalculator build(String input){
        switch (input) {
            case "+":
                return new Addition();
            case "^2":
                return new Square();
            default:
                return null;
        }
    }

    static class Addition implements ICalculator {
        @Override
        public Double calculate(Double val1, Double val2) {
            return val1 + val2;
        }
    }

    static class Square implements ICalculator {
        @Override
        public Double calculate(Double val1, Double val2) {
            return Math.pow(val1, 2);
        }
    }

    interface ICalculator {
        Double calculate(Double val1, Double val2);
    }
}
