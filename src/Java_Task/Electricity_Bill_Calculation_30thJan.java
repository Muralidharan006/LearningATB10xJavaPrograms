package Java_Task;

import java.util.Scanner;

public class Electricity_Bill_Calculation_30thJan {
    //*Electricity Bill Calculation (Based on Units Consumed)
    //
    //           :- take the input from the user of Units.
    //
    //    Implement Rate Structure:
    //
    //    Define the rate structure for calculating the bill based on the number of units consumed.
    //
    //            :-  First 100 units: 0.50Rs per unit
    //
    //            :-  Next 100 units (101-200): 0.75Rs per unit
    //
    //            :- Next 100 units (201-300): 1.20Rs per unit
    //
    //            :- Above 300 units: 1.50Rs per unit
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter consumes units...");
        double units = sc.nextDouble();
        double amountToBePaid = 0;

        if(units>=0){
            if(units<=100){
                amountToBePaid = units *0.50;
            }
            else if(units<=200){
                amountToBePaid = units *0.75;
            }
            else if(units<=300){
                amountToBePaid = units *1.20;
            }else{
                amountToBePaid = units *1.50;
            }
        }else{
            System.out.println("Invalid input");
        }

        System.out.println("The customer monthly electricity bill is..._"+amountToBePaid);
        sc.close();

    }
}
