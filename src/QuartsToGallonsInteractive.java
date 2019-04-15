import java.util.Scanner;
public class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        int numberofquartsinputed;
        final int NUM_QUARTS_IN_GALLON =4;
        int numberofQuartsInAGallon = 4;
        int remainderOfQuarts;
        int numberOfGallons;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the number of quarts needed to do the job>>>>");
        numberofquartsinputed = keyboard.nextInt();
        numberOfGallons =  numberofquartsinputed / 4;
        remainderOfQuarts = numberofquartsinputed % numberofQuartsInAGallon;

        System.out.println("The number if gallons ordered is" + numberOfGallons + " and the number of quarts remaining is" + remainderOfQuarts);




    }
}