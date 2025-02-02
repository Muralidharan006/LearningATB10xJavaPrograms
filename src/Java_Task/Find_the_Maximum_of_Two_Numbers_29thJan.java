package Java_Task;

import java.util.Scanner;

public class Find_the_Maximum_of_Two_Numbers_29thJan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1...");
        int number1 = sc.nextInt();
        System.out.println("Enter the number 2....");
        int number2 = sc.nextInt();

        if(number1==number2){
            System.out.println("Both number are equal....");
        }else if(number1>number2){
            System.out.println("number 1 is greater then number 2");
        }else{
            System.out.println("Number 2 is greater then number 1");
        }
    }
}
