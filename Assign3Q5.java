public class Assign3Q5 {
    public static void main(String[] args) {
        int numValue = 5;
        System.out.println("The number is: " + numValue);

        int factorial = 1;
        int i = 1;
        while (i <= numValue) {
            factorial *= i;
            i++;
        }

        System.out.println("The factorial of " + numValue + " is: " + factorial);
    }
}
