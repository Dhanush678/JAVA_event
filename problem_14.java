import java.util.Scanner;

public class problem_14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        int array[]=new int[10];

        try {
            int result = num1 / num2;
            System.out.println("The result of the division is: " + result);
            try {

                for (int i=0;i<array.length;i++){
                    array[i]=scanner.nextInt();
                }
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            catch (ArrayStoreException e){
                System.out.println(e);
            }

        } catch (NumberFormatException e) {
            System.out.println("The number you entered is not an integer.");
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero.");
        } catch (Exception e){
            System.out.println("Thank you for using the integer division program.");
        }
    }
}
