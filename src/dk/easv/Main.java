package dk.easv;

import dk.easv.operators.*;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Operator[] calculator = new Operator[] {
            new PlusOperator(),
            new MinusOperator(),
            new DivideOperator()
        };

        while(true) {
            Scanner s = new Scanner(System.in);
            System.out.print("Please enter number 1: ");
            double number1 = s.nextDouble();

            System.out.print("Please enter number 2: ");
            double number2 = s.nextDouble();

            int operatorIndex = -1;
            while (operatorIndex < 0) {
                System.out.println("Please pick the operator:");
                for (int i = 0; i < calculator.length; i++) {
                    Operator operator = calculator[i];
                    System.out.println("  " + (i + 1) + ": " + operator.getName());
                }
                System.out.print("My choice: ");
                operatorIndex = s.nextInt() - 1;
                if (operatorIndex < 0 || operatorIndex >= calculator.length) {
                    operatorIndex = -1;
                }
            }

            Operator operator = calculator[operatorIndex];
            System.out.println("The result is: " + operator.calculate(number1, number2));

            System.out.println("Hit Enter to do a new calculation");
            System.in.read();
        }

    }
}
