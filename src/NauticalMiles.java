import java.util.Scanner;

public class NauticalMiles {
    public static void mian(String [] args){
        double numberofnauticalMiles = 1.150779;
        double numberofkilometersinanauticalmile = 1.852;
        double userinput;


        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the amount of nautical miles" );
        userinput = keyboard.nextInt();
        
        System.out.println("Number of miles " + (numberofnauticalMiles / userinput) + " Number of Kilometers: " + (numberofkilometersinanauticalmile / userinput ));

















    }
















}
