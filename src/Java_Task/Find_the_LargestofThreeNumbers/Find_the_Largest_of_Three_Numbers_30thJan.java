package Java_Task.Find_the_LargestofThreeNumbers;

import java.util.Scanner;

public class Find_the_Largest_of_Three_Numbers_30thJan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number...");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number...");
        int num2 = sc.nextInt();
        System.out.println("Enter Third number....");
        int num3 = sc.nextInt();

        if(num1==num2 && num1==num3){
            System.out.println("All three number are equal");
        }
        else if(num1>num2 && num1>num3){
            System.out.println("Num1 is greatest");
        }
        else if(num2>num1&&num2>num3){
            System.out.println("Num2 is greatest");
        }
        else{
            System.out.println("Num3 is greatest");
        }

    }
}
