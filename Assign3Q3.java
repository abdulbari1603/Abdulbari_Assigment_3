public class Assign3Q3 {
    public static void main(String args[]) {
        // Define the number for which factorial will be calculated
        int numberToFactorize = 5;
        System.out.println("Input number: " + numberToFactorize);

        // Initialize the factorial variable to 1
        int factorialResult = 1;

        // Calculate the factorial of the number
        for (int i = 2; i <= numberToFactorize; i++) {
            factorialResult *= i;
        }

        // Print the factorial result
        System.out.println("Factorial of " + numberToFactorize + " is: " + factorialResult);
    }
}
