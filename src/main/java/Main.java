import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        int numInput;
        int lastGuess = 0; // keeps track of previous guess if user has to guess again
        int guessCount = 0;
        boolean correctGuess = false;
        int secretNum = 86;

        while(!correctGuess) {
            System.out.print("Guess a number between 1 and 100: ");
            Scanner in = new Scanner(System.in);
            numInput = Integer.parseInt(in.nextLine());

            if (guessCount == 0 || numInput != lastGuess){
                guessCount++;
                if(numInput == secretNum) {
                    correctGuess = true;
                    System.out.println("You guessed correctly! It took you " + guessCount + " tries.");
                }
                else if(numInput < secretNum) {
                    System.out.println(numInput + " is too low. Try Again.");
                }
                else {
                    System.out.println(numInput + " is too high. Try Again.");
                }

                lastGuess = numInput;
            }
            else {
                System.out.println("You just guessed that, try again.");
            }
        }
    }
}
