public class problem_8_b {
    private int number;
    private String name;
    public problem_8_b() {
        number = 0;
        name = "Default";
    }
    public problem_8_b(problem_8_b obj) {
        this.number = obj.number;
        this.name = obj.name;
    }
    public void display() {
        System.out.println("Number: " + number);
        System.out.println("Name: " + name);
    }
    public static void main(String[] args) {
        problem_8_b obj1 = new problem_8_b();
        problem_8_b obj2 = new problem_8_b(obj1);
        obj1.display();
        obj2.display();
    }
}
