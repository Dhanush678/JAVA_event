import java.util.Scanner;

interface attendence{
    int min=75;
    int attend(int att);
}
interface marks{
    int min_marks=25;
    int CIE(int marks);
}


public class problem_11 implements attendence ,marks {

    @Override

    public int attend(int att) {
        if(att>min){
            return 1;
        }
        else {
            return 0;

        }

    }

    @Override
    public int CIE(int marks) {
        if(marks>25){
            return 1;
        }
        else {
            return 0;

        }
    }
    problem_11 obj=new problem_11();
    int key1=obj.attend(90);
    int key2=obj.CIE(40);



}
