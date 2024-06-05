import java.util.Scanner;

public class Main 
{
    
    public static void main(String[] args) 
    {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Display information
        displayInfo();
        
        // Get user inputs
        double[] numbers = getNumbers(scanner);
        char operation = getOperation(scanner);
        double result = 0;

        switch (operation) 
        {
            case '+':
                result = add(numbers[0], numbers[1]);
                break;
            case '-':
                result = subtract(numbers[0], numbers[1]);
                break;
            case '*':
                result = multiply(numbers[0], numbers[1]);
                break;
            case '/':
                if (numbers[1] != 0) 
                {
                    result = divide(numbers[0], numbers[1]);
                } 
                else 
                {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation.");
                return;
        }

        // Display results
        System.out.println("The result is: " + result);
        
        // Close the scanner
        scanner.close();
    }

    public static void displayInfo() 
    {
        System.out.println("This is a simple calculator program.\n");
        System.out.println("You can add, subtract, multiply, and divide two numbers.\n");
    }

    public static double[] getNumbers(Scanner scanner) 
    {
        System.out.print("Enter the first number: ");
        while (!scanner.hasNextDouble()) 
        {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next(); // Clear the invalid input
            System.out.print("Enter the first number: ");
        }
        double a = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        while (!scanner.hasNextDouble()) 
        {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next(); // Clear the invalid input
            System.out.print("Enter the second number: ");
        }
        double b = scanner.nextDouble();

        return new double[]{a, b};
    }

    public static char getOperation(Scanner scanner) 
    {
        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = ' ';
        boolean valid = false;

        while (!valid) 
        {
            String input = scanner.next();
            if (input.length() == 1) 
            {
                operation = input.charAt(0);
                if (operation == '+' || operation == '-' || operation == '*' || operation == '/') 
                {
                    valid = true;
                } 
                else 
                {
                    System.out.print("Invalid operation. Please enter one of (+, -, *, /): ");
                }
            } 
            else 
            {
                System.out.print("Invalid input. Please enter a single character: ");
            }
        }

        return operation;
    }

    public static double add(double a, double b) 
    {
        return a + b;
    }

    public static double subtract(double a, double b) 
    {
        return a - b;
    }

    public static double multiply(double a, double b) 
    {
        return a * b;
    }

    public static double divide(double a, double b) 
    {
        return a / b;
    }
}
