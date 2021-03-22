package dk.easv.operators;

public class MinusOperator extends Operator {
    @Override
    public double calculate(double number1, double number2) {
        return number1 - number2;
    }

    @Override
    public String getName() {
        return "Minus";
    }
}
