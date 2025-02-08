package Java_Task.task_5thFeb_ForAndWhileLoop;

public class Print_even_numbers_from_1_to_20_While {
    public static void main(String[] args) {
        int i = 1;
        while(i<=20){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
