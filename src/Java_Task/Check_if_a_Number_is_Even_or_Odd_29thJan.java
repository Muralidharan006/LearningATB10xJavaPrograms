package Java_Task;

import java.util.Scanner;

public class Check_if_a_Number_is_Even_or_Odd_29thJan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number......");
        int number = sc.nextInt();
        if(number%2==0){
            System.out.println("The given number is Even");
        }else{
            System.out.println("The given number is odd");
        }

    }
}
