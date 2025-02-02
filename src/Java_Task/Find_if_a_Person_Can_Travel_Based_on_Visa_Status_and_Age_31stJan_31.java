package Java_Task;

import java.util.Scanner;

public class Find_if_a_Person_Can_Travel_Based_on_Visa_Status_and_Age_31stJan_31 {
    //* Find if a Person Can Travel Based on Visa Status and Age.
    //     take the input from the user for
    //            Age (integer).
    //            Visa Status (String or boolean).
    //     Check Eligibility:
    //             :- If age is 18 or older and visa status is valid, the person can travel.
    //Otherwise, the person cannot travel.
    //        Validation Criteria
    //                Age: - Must be a non-negative integer.
    //                         :- Should be greater than or equal to 18 to be eligible to travel.
    //        Visa Status :- Must be a valid string indicating the visa status (e.g., "valid" or "invalid").
    //           :- You can also use a boolean where true indicates a valid visa and false indicates an invalid visa.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age of the passenger...");
        int Age = sc.nextInt();

        boolean Visa = false;
        if (Age > 0) {
            if (Age >= 18) {
                Visa = true;

            } else {
                System.out.println("Sorry you cannot travel bcoz you don't have visa");
            }
        } else {
            System.out.println("Enter valid Age since");
        }
        if(!Visa){
            System.out.println("You cant travel since you don't have visa");
        }else{
            System.out.println("You can travel, Have a safe journey....!");
        }
sc.close();
    }
}
