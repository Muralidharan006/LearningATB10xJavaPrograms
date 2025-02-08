package Java_Task.task_5thFeb_ForAndWhileLoop;

public class Print_the_sum_of_first_10_natural_numbers {
    public static void main(String[] args) {


        //1
        //1+2 = 3
        //3+4=7
        int sum =0;
        for(int i=1;i<=10;i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
