package dk.easv.operators;

public class PlusOperator extends Operator {
    @Override
    public double calculate(double number1, double number2) {
        return number1 + number2;
    }

    @Override
    public String getName() {
        return "Plus";
    }
}
