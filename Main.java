import java.util.Scanner;

class ScientificCalculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }


    int subtract(int a, int b) {
        return a - b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

   
    int multiply(int a, int b) {
        return a * b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    
    double divide(double a, double b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero!");
            }
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ScientificCalculator calc = new ScientificCalculator();

        System.out.println("=== Scientific Calculator ===");
        System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Result: " + calc.add(num1, num2));
                break;

            case 2:
                System.out.println("Result: " + calc.subtract(num1, num2));
                break;

            case 3:
                System.out.println("Result: " + calc.multiply(num1, num2));
                break;

            case 4:
                System.out.println("Result: " + calc.divide(num1, num2));
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}
 
    

