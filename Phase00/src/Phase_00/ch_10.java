package Phase_00;

import java.util.Scanner;

public class ch_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber;
        double secondNumber;
        String request = "";
        System.out.print("Enter the first number =  ");
        firstNumber = scanner.nextDouble();

        System.out.print("Enter the 2nd number =  ");
        secondNumber = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("add , subtract , multiply , divide");

        System.out.print("Enter the request = " + request);
        request = scanner.nextLine();
        String response = String.valueOf(switch (request) {
            case "add" -> add(firstNumber, secondNumber);
            case "subtract" -> subtract(firstNumber, secondNumber);
            case "multiply" -> multiply(firstNumber, secondNumber);
            case "divide" -> divide(firstNumber, secondNumber);

            default -> "Unknown command";
        });

        System.out.println("the calculates = " + response);

    }

    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        try {
            if (y == 0) {
                throw new IllegalArgumentException("y cannot be 0");
            }
        } catch (ArithmeticException e) {
            System.out.println("The y is equal = 0 " + e.getMessage());
        }
        return x / y;
    }
}
