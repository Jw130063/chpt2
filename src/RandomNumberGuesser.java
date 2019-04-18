import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuesser {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Random rand = new Random();

        int n = rand.nextInt(11);

        n = n+ 1;

        System.out.println("Guess a number 1-10");

        int ranNumGuesser = input.nextInt();

        if(ranNumGuesser == n){
            System.out.println("You guessed correct!");
        }
        else
            System.out.println("You guessed wrong");

    }















}
