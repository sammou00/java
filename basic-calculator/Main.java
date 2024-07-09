import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        try
        {
            do
            {
                float num1 = getNumber(scanner);
                String operator = getOperator(scanner);
                float num2 = getNumber(scanner);

                float result = calculate(num1, num2, operator);
                System.out.println("Result: " + result);
            } while (calculateAgain(scanner));
            System.out.println("Thank you for Using the Calculator");
        }
        finally
        {
            scanner.close();
        }
    }

    private static float getNumber(Scanner scanner)
    {
        float num = 0;
        boolean validInput = false;

        while (!validInput)
        {
            System.out.print("Enter a number: ");
            try
            {
                num = scanner.nextFloat();
                validInput = true;
            } catch (InputMismatchException e)
            {
                System.out.println(
                    "Invalid input. Please enter a valid number."
                );
                scanner.next();
            }
        }

        return num;
    }

    private static String getOperator(Scanner scanner)
    {
        String operator;
        boolean validInput = false;

        while (!validInput)
        {
            System.out.print("Enter an operator (+, -, *, /): ");
            operator = scanner.next();
            if (
                operator.equals("+") ||
                operator.equals("-") ||
                operator.equals("*") ||
                operator.equals("/")
            )
            {
                validInput = true;
                return operator;
            }
            else
            {
                System.out.println(
                    "Invalid operator. Please enter one of +, -, *, /."
                );
            }
        }

        return null;
    }

    private static float calculate(float num1, float num2, String operator)
    {
        switch (operator)
        {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0)
                {
                    System.out.println("Cannot divide by zero");
                    return Float.NaN;
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException(
                    "Invalid operator: " + operator
                );
        }
    }

    private static boolean calculateAgain(Scanner scanner)
    {
        char choice;
        boolean validInput = false;

        while (!validInput)
        {
            System.out.print("Do you want to calculate again? (y/n): ");
            choice = scanner.next().toLowerCase().charAt(0);
            if (choice == 'y' || choice == 'n')
            {
                validInput = true;
                return choice == 'y';
            }
            else
            {
                System.out.println("Invalid input. Please enter 'y' or 'n'.");
            }
        }

        return false;
    }
}
