package small_programs.mathematical;
import java.util.Scanner;

public class AddTwoIntegers {
    
    /* This program will store and add two integer numbers. After the addition, 
    the final sum is displayed on the screen. 
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int x  = scan.nextInt();
        int y = scan.nextInt();
        scan.close();

        // add two numbers
        System.out.println("The sum of " + x + " + " + y + " = " + (x + y));
    }
}
