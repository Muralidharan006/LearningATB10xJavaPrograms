package Java_Task;

import java.util.Scanner;

public class Check_if_a_Number_is_Divisible_by_5_and_11_1stFeb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer....!");
        int num = sc.nextInt();
        if(num>0){
            if(num%5==0 && num%11==0){
                System.out.println("Yes this number is divisible by 5 and 11:" +num);
            }else{
                System.out.println("This number is not divisible by both 5 and 11");
            }
        }else{
            System.out.println("Enter Positive number");
        }
        sc.close();
    }
}
