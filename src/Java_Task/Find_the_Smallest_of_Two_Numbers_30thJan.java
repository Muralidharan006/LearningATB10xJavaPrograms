package Java_Task;

import java.util.Scanner;

public class Find_the_Smallest_of_Two_Numbers_30thJan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number....");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number...");
        int num2 = sc.nextInt();

        if(num1==num2){
            System.out.println("Both num are equal");
        }else if(num1 < num2){
            System.out.println("num1 is smallest");
        }else{
            System.out.println("num2 is smallest");
        }
    }
}
