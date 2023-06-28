public class problem_8_a {
    public problem_8_a(String name, String color) {
        System.out.println("name:\t"+name);
        System.out.println("color\t"+color);
    }
    public problem_8_a(String name) {
        System.out.println("name:\t"+name);
    }

    public static void main(String[] args) {

        problem_8_a obj=new problem_8_a("cat","white");
        problem_8_a newobj=new problem_8_a("cat");

    }
}
