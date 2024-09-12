import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Type the type of operation you wanna do (+, -, /, *): ");
        char operation = scan.nextLine().charAt(0);                 
        
        // The charAt(0) is a method to extract the first character from a string in Java
        // It says "index:0" in the parenthesis so I guess it treats strings as arrays of characters and the 0 is to get the first one
        // Without it it scans the + sign as a string, must be the cause of the code not working before


        System.out.println("Type the first number: ");
        Float num1 = scan.nextFloat();

        System.out.println("Type the second number: ");
        Float num2 = scan.nextFloat();

        double result = 0;

        switch (operation) {                            // Changed to a switch case 'cause it's prettier *-*
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1/num2;
                    break;
                }
                else {
                    System.err.println("Error. Division by 0");             // Added if statment to prevent division by 0 becaus math
                    scan.close();
                }
                
            case '*':
                result = num1*num2;
                scan.close();
                break;
        
            default:
            System.err.println("U fucked up smth, pay attention");
                break;
        }
        System.out.printf("%.2f %c %.2f = %.2f", num1, operation, num2, result);
        scan.close();                                                                   // Figured out that u have to close the scanner
                                                                                        // Don't know why though, security purposes maybe?
    }
}
