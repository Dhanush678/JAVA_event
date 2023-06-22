public class problem_6 {
    public static void main(String[] args) {
        int a[]= {1, 3, 5, 6, 8, 9, 0, 87, 6, 5, 4, 3};
        int sum=0;
        for (int i=0;i<a.length;i++){
            if(a[i]%2==0){
                sum=sum+a[i];

            }
            else {
                continue;
            }
        }
        System.out.println(sum);
    }
}
