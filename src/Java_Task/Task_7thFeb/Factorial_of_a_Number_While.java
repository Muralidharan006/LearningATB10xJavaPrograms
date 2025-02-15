package Java_Task.Task_7thFeb;

import java.util.Scanner;

public class Factorial_of_a_Number_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number....");
        int num = sc.nextInt();
        int mul = 1;
        while(num>=1){
          mul = num*mul;
          num--;
          if(num==1){break;}
        }
        System.out.println(mul);
    }
}
