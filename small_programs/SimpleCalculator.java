package small_programs;
// This program is exactly what it seems...a calculator.

public class SimpleCalculator {

    // Instance Variables
    private double firstNumber;
    private double secondNumber;

    // Instance Methods
    public double getFirstNumber() {  // getter
        return firstNumber;
    }

    public double getSecondNumber() {  // getter
        return secondNumber;
    }

    public void setFirstNumber(double value) {  // setter
        this.firstNumber = value;
    }

    public void setSecondNumber(double value) {  //setter
        this.secondNumber = value;
    }

    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return (secondNumber - firstNumber) * -1; // Use the * -1 because -(a - b) = b - a which is what I want
    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;
        }
        return firstNumber / secondNumber;
    }

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(0);
        calculator.setSecondNumber(1.5);
        System.out.println("Adding = " + calculator.getAdditionResult());
        System.out.println("Subtracting = " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("Multiplying = " + calculator.getMultiplicationResult());
        System.out.println("Dividing = " + calculator.getDivisionResult());
    }
    
}
