import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Hello, would you like to create a account in our bank? (yes/no)");

        String answer = scan.nextLine();

        if (answer.equals("yes") || answer.equals("Yes")) {
            System.out.println("Great! Please introduce your credentials bellow.");
            System.out.printf("\nFull name: ");
            String name = scan.nextLine();

            System.out.printf("\nE-mail: ");
            String email = scan.nextLine();

            System.out.printf("\nDefine a password: ");
            String password = scan.nextLine();

            System.out.println("Thanks for creating a account!");

            double money = 0;

            System.out.println("Possible actions:");
            System.out.println("Deposit - Withdraw - Delete account - Change account information");

            String action = scan.nextLine();

            switch (action) {
                case "Deposit":
                        System.out.println("You typed Deposit");
                    break;

                case "Withdraw":
                        System.out.println("You selected Withdraw, please input the amount you want to witdraw from your account");
                        double Withdraw = scan.nextDouble();
                        if (Withdraw > money) {
                            System.err.println("You curently don't have enough deposited to withdraw tha ammount.");
                            System.err.printf("You curently have %.2f in your account.", money);
                        } else if (Withdraw <= money) {
                            System.out.println();
                        }

                    break;

                case "Delete account":
                        System.out.println("Account deleted. Please create a new account if you want to continue to use our services.");
                    break;

                case "Change account information":
                        System.out.println("You typed Change");
                    break;
            
                default:
                    break;
            }


        } else if (answer.equals("no") || answer.equals("No")) {
            System.out.println("Allright, let me know if you change your mind!");
            
        } else {
            System.err.println("Command not recognized.");

        };

    }
}
