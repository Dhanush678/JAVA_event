public class problem_14_a {
    public static void main(String[] args) {
        int a=3;
        int b=0;
        String name = null;
        int arr[]=new int[2];
        try{
            System.out.println("initializing try statment");
            int c=a/b;
            for(int g=0;g<5;g++){
                arr[g]=5;
            }
            System.out.println(name.length());

        }
        catch (ArithmeticException e){
            System.out.println("Arithematic exception invloked");
            System.out.println(e);

        }
        catch (NullPointerException n){
            System.out.println("nullpointer exception invoked");
            System.out.println(n);
        }
        catch(ArrayIndexOutOfBoundsException h){
            System.out.println("arrayoutof bound invoked");
            System.out.println(h);


        }
    }
}
