package ex_08_if_condition;

import java.util.Scanner;

public class Lab063_IFElse_IFElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2");
        int num2 = sc.nextInt();
        if(num1>num2){
            System.out.println("num1 is greater then num2");
        } else if (num1<num2) {
            System.out.println("num2 is greater then num1");
        }else{
            System.out.println("Both numbers are equals");
        }

        }
    }

