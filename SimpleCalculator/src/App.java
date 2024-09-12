import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Type the type of operation you wanna do (+, -, /, *): ");
        char operation = scan.nextLine().charAt(0);

        System.out.println("Type the first number: ");
        Float num1 = scan.nextFloat();

        System.out.println("Type the second number: ");
        Float num2 = scan.nextFloat();

        if (operation == '+') {
            System.out.printf("\nThe result of %.2f + %.2f is: %.2f", num1, num2, num1+num2);
        }
        else if (operation == '-') {
            System.out.printf("\nThe result of %.2f - %.2f is: %.2f", num1, num2, num1-num2);
        }
        else if (operation == '/') {
            System.out.printf("\nThe result of %.2f / %.2f is: %.2f", num1, num2, num1/num2);
        }
        else if (operation == '*') {
            System.out.printf("\nThe result of %.2f × %.2f is: %.2f", num1, num2, num1*num2);
        }
        else {
            System.err.println("Operation incorrect, please select one of the operations above.");
        }
    }
}
