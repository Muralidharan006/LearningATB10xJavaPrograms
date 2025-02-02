package Java_Task.Find_the_LargestofThreeNumbers;

import java.util.Scanner;

public class Check_if_a_Person_is_Eligible_for_a_Loan_30thJan {
    //*Take the below User info and store it into the variables:
    //
    //              Age (integer)
    //
    //              Salary (double or float)
    //
    //              Credit Score (integer)
    //    Age Validation:
    //
    //              :- Check if the age is a positive integer.
    //
    //              :- Ensure the age is at least 18 years old.
    //
    //              :- Max age can be 80.
    //    Salary Validation:
    //
    //             :- Check if the salary is a positive number.
    //
    //             :- Define a minimum salary threshold (e.g., 30,000).
    //
    //    Credit Score Validation:
    //
    //             :- Check if the credit score is a positive integer.
    //
    //             :- Define a minimum credit score threshold (e.g., 650).
    //
    //             :- Max credit score threshold (e.g., 850).

    //Credit score formula


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age...");
        int age = sc.nextInt();
        System.out.println("Enter Salary...");
        double salary = sc.nextDouble();
        System.out.println("Enter Credit score...");
        double creditscore = sc.nextDouble();
        double minsalary = 30000;
        int mincreditscore = 650;
        int maxcreditscore = 850;
        double maxsalary = 200000;

        if(age>0){
            if(age>=18&&age<=80){
                System.out.println("Age validation success");
                if(salary>0){
                    System.out.println("Salary is a positive integer");
                    if(salary<minsalary){
                        System.out.println("Not Eligible for loan:(");
                    }else{
                        System.out.println("Salary is not less than minimum salary");
                        creditscore = mincreditscore + ((salary - minsalary) / (maxsalary - minsalary)) * (maxcreditscore - mincreditscore);

                        System.out.println("The Employees credit score is:  "+creditscore);
                        if(creditscore>=650 && creditscore<=850){
                            System.out.println("He is eligible for a loan:):)");
                        }
                    }

                }else{
                    System.out.println("Salary is not a positive integer");
                }
            }else{
                System.out.println("Employee Age should be between 18 to 80");
            }
        }else{
            System.out.println("Age should be greater than zero");
        }
        sc.close();
    }
}
