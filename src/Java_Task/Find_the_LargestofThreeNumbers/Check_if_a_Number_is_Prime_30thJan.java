package Java_Task.Find_the_LargestofThreeNumbers;

import java.util.Scanner;

public class Check_if_a_Number_is_Prime_30thJan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number...");
        double num = sc.nextDouble();
        boolean isprime = true;
        if (num <= 1) {
            System.out.println("Its not a prime number");
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {

                if (num % i == 0) {
                    isprime = false;
                    break;
                }

            }
            if(isprime == false){
                System.out.println("Its not prime number");
            }else{
                System.out.println("Its a prime number");
            }

        }

    }
}

