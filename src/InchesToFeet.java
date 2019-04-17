import java.util.Scanner;

public class InchesToFeet {
public static void main(String[] args){
    int InchesInFeet = 12;
    int userEntryInches;


    System.out.print("Please enter a number of inches");
    Scanner userinput = new Scanner(System.in);
    userEntryInches = userinput.nextInt();

    System.out.println(" number of feet " + ( userEntryInches / InchesInFeet) + "number of inches " + (userEntryInches % InchesInFeet));







}













}
