import java.util.Scanner;

public class problem_4 {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0){
           if(a>0){
               System.out.println("positive even number");
           }
           else{
               System.out.println("Negative even number");
           }
        }
        else{
            if(a>0){
                System.out.println("Positive odd number");

            }
            else System.out.println("negative odd number");
        }
    }
}
