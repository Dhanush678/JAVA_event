import java.util.Scanner;

public class problem_3 {
    public static void main(String[] args) {
        int a,b;
        System.out.println("enter the number a:");
        Scanner sc=new Scanner(System.in);
        a= sc.nextInt();
        System.out.println("enter the number b:");
        b=sc.nextInt();
        System.out.println("enter the operator");
        char c=sc.next().charAt(0);
        switch (c){
            case '+':
                System.out.println("the sum is :");
                System.out.println(a+b);
                break;
            case '-':
                System.out.println("the difference is :");
                System.out.println(a-b);
                break;
            case '*':
                System.out.println("the product is :");
                System.out.println(a*b);
                break;
            case '/':
                System.out.println("the quotient is :");
                System.out.println(a/b);
                break;
            case '%':
                System.out.println("the remainder is :");
                System.out.println(a%b);
                break;





        }


    }
}
