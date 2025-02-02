package Java_Task;

import java.util.Scanner;

public class Find_if_a_Person_is_Senior_Citizen_Based_on_Age_1stfeb_25 {
    //*Find if a Person is Senior Citizen Based on Age.
    //
    //         :- take the age input from the user.
    //
    //        Implement Age Category Logic:
    //
    //Define the criteria for different age categories:
    //
    //Child: Age 0 to 12
    //
    //Teenager: Age 13 to 19
    //
    //Adult: Age 20 to 64
    //
    //Senior Citizen: Age 65
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age...");
        int age = sc.nextInt();
        if(age>=0 && age<=120){
            if(age>=0 && age<=12){
                System.out.println("You belong to the Child category");
            }else if(age>=13 && age<=19){
                System.out.println("You belong to the Teenager category");
            } else if(age>=20 && age<=64){
                System.out.println("You belong to the Adult category");
            }else{
                System.out.println("You belong to the Senior Citizen category");
            }
        }else{
            System.out.println("Enter Valid value...");
        }

sc.close();
    }
}
