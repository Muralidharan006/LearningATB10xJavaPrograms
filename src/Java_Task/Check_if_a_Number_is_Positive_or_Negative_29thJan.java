package Java_Task;

import java.util.Scanner;

public class Check_if_a_Number_is_Positive_or_Negative_29thJan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number.....");
        int number = sc.nextInt();
        System.out.println(number);
        if(number<0){
            System.out.println("Its negative number");
        }else{
            System.out.println("Its positive number");
        }
    }
}
