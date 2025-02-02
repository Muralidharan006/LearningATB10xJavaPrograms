package ex_13_Functions;

import java.math.BigInteger;
import java.util.Scanner;

public class Lab127_InterviewQ {
    public static void main(String[] args) {
        //Create a function of sub, sum, Mul and Div
        // with parameter, a, b(take the parameter from the user
        // Logic building
        // Step 1 --> Inputs and output
        //Input --> Scanner
        //Output --> Int

        Scanner sc = new Scanner(System.in);
        System.out.println("First number");
      int a = sc.nextInt();
        System.out.println("Second number");
      int b = sc.nextInt();

      int result_sum = sum(a,b);
        int result_sub = sub(a,b);
        int result_Mul = Mul(a,b);
        int result_Div = Div(a,b);
        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_Mul);
        System.out.println(result_Div);

    }
    static int sum(int a, int b){
        return (a+b);    }
    static int sub(int a, int b){
        return a-b;    }
    static int Mul(int a, int b){
        return a*b;    }
    static int Div(int a, int b) {
        if (a <= b && b != 0) {

        } else {
            System.out.println("Incorrect input");
            System.exit(0);
        }
        return a / b;
    }

}
