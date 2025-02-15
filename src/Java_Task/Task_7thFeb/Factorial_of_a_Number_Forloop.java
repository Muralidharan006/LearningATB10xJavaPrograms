package Java_Task.Task_7thFeb;

import java.util.Scanner;

public class Factorial_of_a_Number_Forloop {
    public static void main(String[] args) {
        //5!=5x4x3x2x1

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer...");
        int num = sc.nextInt();
        int mul = 1;
       for(int i=num; i>=1;i--){
           mul = i * mul;
           if(num==1){ break; }
       }
        System.out.println(mul);

    }
}
