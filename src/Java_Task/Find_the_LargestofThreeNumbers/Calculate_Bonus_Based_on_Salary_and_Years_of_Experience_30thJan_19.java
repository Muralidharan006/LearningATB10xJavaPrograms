package Java_Task.Find_the_LargestofThreeNumbers;

import java.util.Scanner;

public class Calculate_Bonus_Based_on_Salary_and_Years_of_Experience_30thJan_19 {
    public static void main(String[] args) {
        //*Calculate Bonus Based on Salary and Years of Experience.
        //
        //          :- take the salary and Year info from the User.
        //
        //Implement Bonus Calculation Logic:
        //
        //     Define the bonus structure based on salary and years of experience.
        //
        //           :- If years of experience is less than 1 year: No bonus.
        //
        //           :- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
        //
        //           :- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
        //
        //           :- If years of experience is greater than 6 years: Bonus is 15% of the salary.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary...");
        int salary = sc.nextInt();
        System.out.println("Enter years");
        int year = sc.nextInt();
        double bonous = 0;
        if(year<=1){
            System.out.println("Sorry bro no bonus for you.....!");
        }else if(year>1 && year<=3){
           bonous = salary * 0.05;
        }else if(year>4 && year<=6){
            bonous = salary * 0.10;
        }else{
            bonous = (salary * 0.15);
        }
        System.out.println("Your bonous is "+bonous+"Enjoy dude!!!");
        sc.close();
    }
}
