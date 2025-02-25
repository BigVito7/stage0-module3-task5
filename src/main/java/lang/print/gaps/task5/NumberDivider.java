package lang.print.gaps.task5;

public class NumberDivider {
    void divide(int toBeDivided) {

        // Perform division by 5
        double result = (double) toBeDivided / 5;

        // Print the result
        System.out.println("The result of dividing " + toBeDivided + " by 5 is: " + result);
    }

    public static void main(String[] args) {
        // Create an instance of NumberDivider
        NumberDivider divider = new NumberDivider();

        // Test the divide method
        divider.divide(20); // Example: Divide 20 by 5
    }
    }

