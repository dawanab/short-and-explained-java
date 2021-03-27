// This program will print the integer entered by the user.
//Import the java Scanner for use in the program.
import java.util.Scanner;

//Define the class
public class PrintAnInt {

    //Define the main method for testing. Call the printMyInt() method.
    public static void main(String[] args) {
        printMyInt();
    }
    //Create the method.
    //I can output text to the user with System.out.println().
    //Define an object from the Scanner class, scanner, to read my user input.
    //Store the input into an int variable called nyNumber
    //Return the value of the myNumber variable :)
    public static int printMyInt() {
        System.out.println("Please Enter a number.");
        Scanner scanner = new Scanner(System.in);
     
        int myNumber = scanner.nextInt();
        System.out.println("Your number is " + myNumber);
        scanner.close();
        return myNumber;
    }
    
}