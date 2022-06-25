import java.util.Scanner;
import java.util.Random;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        int numInput;
        int lastGuess = 0; // keeps track of previous guess if user has to guess again
        int guessCount = 0;
        Random rand = new Random();
        int secretNum = rand.nextInt(100) + 1;
        boolean correctGuess = false;

        // the user will be repeatedly prompted to guess until they submit a correct answer
        while(!correctGuess) {
            System.out.print("Guess a number between 1 and 100: ");
            Scanner in = new Scanner(System.in);
            numInput = Integer.parseInt(in.nextLine());

            if (guessCount == 0 || numInput != lastGuess){
                guessCount++;
                if(numInput == secretNum) {
                    correctGuess = true;
                    if(guessCount == 1) {
                        System.out.println("You guessed correctly on the first try! Are you cheating?");
                    }
                    else {
                        System.out.println("You guessed correctly! It took you " + guessCount + " tries.");
                    }
                }
                else if(numInput < secretNum) {
                    System.out.println(numInput + " is too low. Try Again.");
                }
                else {
                    System.out.println(numInput + " is too high. Try Again.");
                }

                lastGuess = numInput; // stores last guess to compare to the next guess
            }
            else {
                System.out.println("You just guessed that, try again.");
            }
        }
    }
}
