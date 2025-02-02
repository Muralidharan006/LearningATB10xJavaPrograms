package Java_Task;

import java.util.Scanner;

public class Check_if_a_Person_is_Eligible_to_Vote_Age_Check_29thJan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age....");
        int Age = sc.nextInt();
        if(Age > 18){
            System.out.println("He is eligible to vote!!!");
        }else{
            System.out.println("Not eligible to vote!!!");
        }
    }
}
