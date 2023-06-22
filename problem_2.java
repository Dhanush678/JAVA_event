import java.util.Scanner;

public class problem_2 {
    public static void main(String[] args) {
        System.out.println("enter the numbers below");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int a=sc.nextInt();
        System.out.println("enter the second number:");
        int b=sc.nextInt();
        System.out.println("enter the third number:");
        int c=sc.nextInt();

        int d=(a>b)?((a>c)?a:c):((b>c)?b:c);

        System.out.println("the greatest of three number is");

        System.out.println(d);

    }
}
