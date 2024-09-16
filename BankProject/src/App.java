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

            double money = 1000;

            System.out.println("Possible actions:");
            System.out.println("Deposit - Withdraw - Delete account - Change account information");

            String action = scan.nextLine();

            // I wnated to make all this funcitions, but I haven't learned that yet
            // So switch case it is

            switch (action) {
                case "Deposit":
                        System.out.println("You selected Deposit, please input the amount you would like to deposit.");
                        money += scan.nextDouble();
                        System.out.printf("Deposit completed. You curently have U$ %.2f in your account.", money);
                    break;

                case "Withdraw":
                        System.out.println("You selected Withdraw, please input the amount you would like to witdraw from your account");
                        double Withdraw = scan.nextDouble();
                        if (Withdraw > money) {
                            System.err.println("You curently don't have enough deposited to withdraw this ammount.");
                            System.err.printf("\nYou curently have U$ %.2f in your account.", money);
                        } else if (Withdraw <= money) {
                            money -= Withdraw;
                            System.out.printf("\nYou withdrew U$ %.2f from your accont and curently has U$%.2f in your account", Withdraw, money);
                        }

                        // Because the whole switch case thing i need to manualy set the money variable before running the program :(

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
