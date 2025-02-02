package ex_08_if_condition;

import java.util.Scanner;

public class Lab062_IFElse_OddAndEven {
    public static void main(String[] args) {
        //Creaet a program which will take a user input and check weather the given number is odd or even
//Logic building
        //Step1- figure out inuts and outputts
        //number (int) ->i/o , scanner class
        //String -> odd or even -> 0p , println

        //Step 2 - Logic rough
        //num%2==0 --> even - modulus - R == 0 -> even
        //num%2 != 0 -> oddd
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = sc.nextInt();

        if (num%2==0){
            System.out.println("The given number is even");
        }else{
            System.out.println("The given number is odd");}
        sc.close();
    }
}
