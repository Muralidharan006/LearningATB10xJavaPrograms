package Java_Task.Task_7thFeb;

public class Calculate_the_sum_of_numbers_from_1_to_100 {

    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1;i<=100;i++){
            sum = i+sum;

        }
        System.out.println("The sum of numbers from 1 to 100 is: "+ sum);

    }
}
