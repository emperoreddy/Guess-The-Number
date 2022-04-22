import java.util.Random;
import java.util.Scanner;

public class GuessTheNum {
    public static void main(String[] args) {
        // GUESS THE NUMBER

        // Input the range of which we guess the number
        Scanner input = new Scanner(System.in);
        System.out.print("Input the range to guess the number: ");
        int range = input.nextInt();

        // Creating the random number with the inputted range
        Random randomNr = new Random();
        int num_To_Guess = randomNr.nextInt(range) + 1;

        // Input the number until you get the right one
        System.out.print("Input the number to guess: ");
        int guessed_Num = input.nextInt();

        while (guessed_Num != num_To_Guess) {
                System.out.println("WRONG, choose again!");
                guessed_Num = input.nextInt();

                if (guessed_Num == num_To_Guess){
                    System.out.println("+---------------------------------+");
                    System.out.println("| The number " + num_To_Guess + " was the RIGHT one! |");
                    System.out.println("+---------------------------------+");
                    System.out.println("The program will now stop :)");
                }
        }

        input.close();

    }
}
