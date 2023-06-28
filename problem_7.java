import java.util.Scanner;

public class problem_7 extends Student{
    public static void main(String[] args) {
        Student obj=new Student();
       double ave= obj.func("test","45","ece");
        System.out.println("average:"+ave);
    }
}
class Student {
    String name, usn, dept;
    int marks[] = new int[8];
    Scanner sc = new Scanner(System.in);

    double func(String name, String usn, String dept) {
        int sum=0;
        int average;
        System.out.println("NAME:\t"+ name);
        System.out.println("USN:\t"+usn);
        System.out.println("dept:\t"+dept);
        for (int i = 1; i < marks.length; i++) {
            System.out.print("marks[" + i+"]:\t");
            marks[i] = sc.nextInt();

        }

        for(int i=1;i< marks.length;i++){
            sum=sum+marks[i];

        }
        return average=(sum/(marks.length-1));

    }
}





