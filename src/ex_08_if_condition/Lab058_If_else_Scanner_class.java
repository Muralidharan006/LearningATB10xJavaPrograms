package ex_08_if_condition;

import java.util.Scanner;

public class Lab058_If_else_Scanner_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age!");
        int age = sc.nextInt();

        if(age>18){
            System.out.println("Eligible to vote!");
        }else{
            System.out.println("Not Eligitble to vote");
        }
    }
}
