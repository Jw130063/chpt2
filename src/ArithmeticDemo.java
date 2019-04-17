import java.util.Scanner;
public class ArithmeticDemo {

    public static void main(String[] args){
    int FirstNumber;
    int SecondNumber;
    int sum;
    int difference;
    int average;

    Scanner input = new Scanner(System.in);
    System.out.print("Please enter an integer");
    FirstNumber = input.nextInt();
    System.out.print("Please enter another integer");
    SecondNumber = input.nextInt();

    sum = FirstNumber + SecondNumber;
    difference =  FirstNumber + SecondNumber;
    average = sum / 2;

    System.out.println(FirstNumber + "  + "  +"   SecondNumber +  "+ average );








    }









}
