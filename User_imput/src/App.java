import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);      // System.in is to make so we can type the imput in the terminal (i think)

        System.out.println("Enter pokemon party member 1: ");

        String pokemon1 = scan.nextLine();

        System.out.println(pokemon1);


    }
}
