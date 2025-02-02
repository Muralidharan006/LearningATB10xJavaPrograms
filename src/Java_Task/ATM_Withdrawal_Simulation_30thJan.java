package Java_Task;

import java.util.Scanner;

public class ATM_Withdrawal_Simulation_30thJan {
    public static void main(String[] args) {
        int Principle = 10000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Withdrawal amount....");
        int Withdrawal = sc.nextInt();
        if(Withdrawal >0 && Withdrawal<=Principle){
            System.out.println("Customer is eligible to withdrawal");
            if(Withdrawal%100==0){
                Principle = Principle - Withdrawal;

            }else{
                System.out.println("But Doesn't meet the ATM Rule");
            }

        }else{
            System.out.println("Check the input withdrawal value");
        }

        System.out.println("Current Principle balance: "+Principle);
    }
}
