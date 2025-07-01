package programs;



import java.util.Scanner;

class Calculator {
    double a, b;
    String operation;

    public Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public double calculate() {
        switch (operation.toLowerCase()) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                if (b != 0)
                    return a / b;
                else
                    throw new ArithmeticException("Cannot divide by zero");
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }

    
    }


public class Problem1 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String op = sc.next();

        Calculator calc = new Calculator(a, b, op);
        try {
            System.out.println("Result: " + calc.calculate());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
	}
}
