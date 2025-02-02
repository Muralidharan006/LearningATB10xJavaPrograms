package Java_Task;

import java.util.Scanner;

public class Check_if_a_Year_is_a_Leap_Year_30thJan {
    public static void main(String[] args) {
        //*Leap Year Formula:
        //A year Y is a leap year if:
        //
        //Y is divisible by 400 → Leap Year
        //Example: 2000, 2400 (Leap Years)
        //Y is divisible by 4 and NOT divisible by 100 → Leap Year
        //Example: 2016, 2024 (Leap Years)
        //Otherwise, it's NOT a leap year
        //Example: 1700, 1800, 1900, 2100 (Not Leap Years)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number....");
        int year = sc.nextInt();

        if(year%400 == 0){
            System.out.println("Its a Leap year.....!");
        }else if(year%4==0&&year%100!=0){
            System.out.println("Its a Leap year.....!");
        }
        else{
            System.out.println("Its not a Leap year....!");
        }

    }
}
