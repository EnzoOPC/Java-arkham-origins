import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);      // System.in is to make so we can type the imput in the terminal (i think)

        // There is a underlined text with a msg saying "Resource leak"... I'm sure that's fine

        List<String> party = new ArrayList<>();     // Why do I have to write an essay just to create a fucking list ;-;

        for (int i = 1; i < 7; i++) {               // for loop cool tho ¬¬
            System.out.printf("\nPokemon number %d: \n", i);
            String pokemon = scan.nextLine();
            party.add(i, pokemon);
        }
        System.out.println("Your finished party is: " + party);
        System.err.println();
        System.err.println();


    }
}
