package Java_Task.Task_7thFeb;

import java.util.Scanner;

public class Multiplication_Table_of_a_Given_Number {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Get the number from the user");
        int num = sc.nextInt();
        for(int i = 1; i<=10;i++){

            System.out.println(num*i);
        }

    }
}
