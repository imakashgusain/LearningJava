package functionalinterface;

public class Main {

    public static void main(String[] args) {


        // Lambda expression for addition
        Calculator addition = (a, b) -> a + b;

        // Lambda expression for subtraction
        Calculator subtraction = (a, b) -> a - b;

        // Lambda expression for multiplication
        Calculator multiplication = (a, b) -> a * b;

        // Lambda expression for division
        Calculator division = (a, b) -> {
            if (b != 0) {
                return a / b;
            } else {
                throw new ArithmeticException("Division by zero");
            }
        };

        // Perform calculations using the lambda expressions
        System.out.println("Addition: " + addition.calculate(10, 5)); // Output: Addition: 15
        System.out.println("Subtraction: " + subtraction.calculate(10, 5)); // Output: Subtraction: 5
        System.out.println("Multiplication: " + multiplication.calculate(10, 5)); // Output: Multiplication: 50
        System.out.println("Division: " + division.calculate(10, 5)); // Output: Division: 2
        // Division by zero will throw an ArithmeticException
         System.out.println("Division: " + division.calculate(10, 0));
    }
}
