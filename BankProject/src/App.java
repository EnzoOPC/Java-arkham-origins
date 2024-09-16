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
            System.out.println("Deposit - Withdraw - Delete account - Change credentials");

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

                case "Change credentials":
                        System.out.println("You selected Change credentials, please confirm your current Name/E-mail and passowrd to continue.");
                        String confirmNameEmail = scan.next();
                        String confirmPass = scan.nextLine();

                        if (confirmNameEmail != name && confirmNameEmail != email) {
                            System.err.println("Name or E-mail not recognized, process terminated.");
                        }
                        else if (confirmPass != password) System.err.println("Password incorrect, process terminated.");

                        else {
                            System.out.println("Please, select the credential you would like to change.");
                            System.out.println("Name - E-mail - Password - All");
                            String change = scan.nextLine();
                            if (change.equals("Name")) {
                                System.out.printf("Type your new name: ");
                                String newName = scan.nextLine();
                                System.out.printf("Your new name is: %s", newName);
                            }
                            else if (change.equals("E-mail")) {
                                System.out.printf("Type your new E-mail: ");
                                String newEmail = scan.nextLine();
                                System.out.printf("Your new E-mail is: %s", newEmail);
                            }
                            else if (change.equals("Password")) {
                                System.out.printf("Type your new password: ");
                                String newPass = scan.nextLine();
                                System.out.printf("Your new password is: %s", newPass);
                            }
                            else if (change.equals("All")) {
                                System.out.printf("Type your new name: ");
                                String newName = scan.nextLine();

                                System.out.printf("Type your new E-mail: ");
                                String newEmail = scan.nextLine();

                                System.out.printf("Type your new password: ");
                                String newPass = scan.nextLine();

                                System.out.println("Your new credentials are:");
                                System.out.printf("\nName: %s", newName);
                                System.out.printf("\nE-mail: %s", newEmail);
                                System.out.printf("\nPassword: %s", newPass);
                                
                            }
                            else System.err.println("Credential non-existent.");
                        }
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
