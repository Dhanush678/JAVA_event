import java.util.Scanner;

public class problem_13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        try {
            int result = num1 / num2;
            System.out.println("The result of the division is: " + result);
        } catch (NumberFormatException e) {
            System.out.println("The number you entered is not an integer.");
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero.");
        } finally {
            System.out.println("Thank you for using the integer division program.");
        }
    }
}
