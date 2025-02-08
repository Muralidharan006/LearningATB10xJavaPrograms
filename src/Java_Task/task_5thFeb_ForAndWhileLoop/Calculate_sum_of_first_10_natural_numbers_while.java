package Java_Task.task_5thFeb_ForAndWhileLoop;

public class Calculate_sum_of_first_10_natural_numbers_while {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while(i<=10){
            sum = i+sum;
            i++;
        }
        System.out.println("The sum of first 10 natural numbser are: "+sum);
    }
}
