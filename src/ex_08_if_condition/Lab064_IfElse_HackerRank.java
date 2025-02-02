package ex_08_if_condition;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab064_IfElse_HackerRank {
    public static void main(String[] args) {
        //*Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
        //
        //A: 90-100
        //
        //B: 80-89
        //
        //C: 70-79
        //
        //D: 60-69
        //
        //F: 0-59

        //Logic Building
        //Step 1
        //Find the inputs/Outputs
        //Input / score -> (1 = 100) / data tupe -> int
        // Output / grade -> data type -> char

        //Step 2 Basic logic
        // If(score >= 90 && score <=100 --> retrun or print grade - A
        //else if(score <=89 && score >=80100 --> retrun or print grade - A


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score!");
        int score = sc.nextInt();
        char grade = 'F';
        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
        } else if (score >= 70 && score <= 79) {
            grade = 'C';
        } else if (score >= 60 && score <= 69) {
            grade = 'D';
        } else if(score <0 || score >100){
            grade = 'O';
        }
        else {
            grade = 'F';
        }
        System.out.println("Your grade is:"+ grade);

    }


}

