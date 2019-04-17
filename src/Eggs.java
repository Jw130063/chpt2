import java.util.Scanner;

public class Eggs {
    public static void main(String[] args){
        double PriceOfSingleEgg = .45;
        double priceOfDozen = 3.25;
        int userEntry;
        double totalPrice;

        System.out.println("Please enter number of eggs you would like");
        Scanner userinput = new Scanner(System.in);
        userEntry = userinput.nextInt();

        totalPrice = ( userEntry/ 12 * priceOfDozen ) + ( userEntry % 12 *  PriceOfSingleEgg);

        System.out.println("you wanted " + userEntry + " eggs. This is" + ( userEntry / 12 ) + "dozen and "
                +  (userEntry % 12) + "single egss for a total of " + totalPrice + " dollars");

        














    }












}
