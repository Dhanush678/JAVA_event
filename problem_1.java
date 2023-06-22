import java.util.Scanner;

public class problem_1
{
    public static void main(String [] args)
    {
        int i, j;
        int a=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows(enter 3 for problem)");
        int n=sc.nextInt();
        for(i = 1; i <= n; i++)
        {
            for(j = 1; j < i; j++)
            {
                System.out.print((a++)+"\t");
            }
            System.out.println(a++);
        }
    }

}
