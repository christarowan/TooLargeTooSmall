/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        String response = "";
        int guess = -1;
        int lastGuess = -1;
        int numberOfTries = 0;
        int min = 1;
        int max = 10;
        int randomMysteryNumber = (int) Math.floor(Math.random() * max - min + 1) + min;

        Scanner sc = new Scanner(System.in);

        while (guess != randomMysteryNumber) {
            System.out.println("Please enter your guess (1-10):");
            guess = sc.nextInt();


           if (guess != lastGuess) {
               numberOfTries++;
           }


            if (guess < randomMysteryNumber) {

                response = "too small";

            } else if (guess > randomMysteryNumber) {
                response = "too large";


            } else {
                response = "correct guess" ;


            }
            System.out.println(response);
            lastGuess = guess;
        }
        System.out.println("Number of guesses was: "+numberOfTries);
    }
}