import java.util.Scanner;

public class Calculator {

    // Method for addition
    public static int add(int a, int b) {
        return a + b;
    }

    // Method for subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Method for multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method for division
    public static double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            throw new ArithmeticException("Error: Division by zero is not allowed.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.println("Choose operation: +, -, *, /");
        char operation = scanner.next().charAt(0);
        
        try {
            switch (operation) {
                case '+':
                    System.out.println("Addition: " + add(num1, num2));
                    break;
                case '-':
                    System.out.println("Subtraction: " + subtract(num1, num2));
                    break;
                case '*':
                    System.out.println("Multiplication: " + multiply(num1, num2));
                    break;
                case '/':
                    System.out.println("Division: " + divide(num1, num2));
                    break;
                default:
                    System.out.println("Invalid operation.");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}