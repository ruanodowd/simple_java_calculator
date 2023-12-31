//Using Switch Case
import java.util.Scanner;
 
public class SimpleCalculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
 

        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = sc.nextInt();
 

        System.out.print("Operation? (+, -, *, /): ");
        String operation = sc.next();
        int result = performOperation(firstNumber, secondNumber, operation);
        System.out.println("Your answer is: " + result);
    }
 
    public static int performOperation(int firstNumber, int secondNumber, String operation)
    {
        int result = 0;
        switch (operation) {
            case "+":
                //implement addition
                return(firstNumber + secondNumber);
            case "-":
                //implement subtraction
                return(firstNumber - secondNumber);
                break;
            case "*":
                return(firstNumber*secondNumber);
                //implement multiplication
            case "/":
                //implement division
                return (firstNumber / secondNumber);
            default:
                System.out.println("Invalid operation");
                break;
        }
        return result;
    }
}