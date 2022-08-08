package small_programs.mathematical;

/* Write a method named hasSameLastDigit with three parameters of type int. 
Each number should be within the range of 10 (inclusive) - 1000 (inclusive). 
If one of the numbers is not within the range, the method should return false.
The method should return true if at least two of the numbers share the same rightmost digit;
Otherwise, it should return false.
 */

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));

    }
    public static boolean hasSameLastDigit(int x, int y, int z) {
        if ((x < 10 || x > 1000) || (y < 10 || y > 1000) || (z < 10 || y > 1000)) {
            System.out.println("Invalid number. Please enter between 10 - 1000");
            return false;
        } else {
            int lastX = x % 10; // Use the % to check the last digit
            int lastY = y % 10;
            int lastZ = z % 10;

            // Checking to see if any of the last digits from our parameter match
            if ((lastX == lastY) || (lastX == lastZ) || (lastY == lastZ)) {
                System.out.println("Numbers are shared.");
                return true;
            }
        }
        return false;
    }
    
}
