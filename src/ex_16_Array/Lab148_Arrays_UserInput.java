package ex_16_Array;

import java.util.Scanner;

public class Lab148_Arrays_UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sixe");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        for(int i = 0;i<size;i++){
            System.out.println("Enter the number");
            numbers[i] = sc.nextInt();
          //  System.out.println(numbers[i]);
        }
        for(int i = 0;i<size;i++){

            System.out.println(numbers[i]);
        }
     }
}
