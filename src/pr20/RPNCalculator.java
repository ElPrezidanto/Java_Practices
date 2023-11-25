package pr20;

import java.util.Stack;

public class RPNCalculator {

    public static double evaluateRPN(String expression) {
        String[] tokens = expression.split(" ");
        Stack<Double> stack = new Stack<>();

        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Double.parseDouble(token));
            } else {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double result = performOperation(token, operand1, operand2);
                stack.push(result);
            }
        }

        return stack.pop();
    }

    private static boolean isNumeric(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static double performOperation(String operator, double operand1, double operand2) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public static void main(String[] args) {
        String expression1 = "5 5 + 5 * 5 /"; //  (5+5) * 5 / 5
        double result = evaluateRPN(expression1);
        System.out.println("Result of 5 5 + 5 * 5 / " + result);

        System.out.println();

        String expression2 = "2 4 6 8 10 * + - /"; //  2 / (4 - (6 + (8 * 10)))
        result = evaluateRPN(expression2);
        System.out.println("Result of 2 4 6 8 10 * + - / : " + result);
    }
}