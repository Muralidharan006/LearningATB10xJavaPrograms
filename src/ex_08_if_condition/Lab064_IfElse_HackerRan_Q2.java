package ex_08_if_condition;

import java.util.Scanner;

public class Lab064_IfElse_HackerRan_Q2 {
    public static void main(String[] args) {
        //Triangle Classifier:
        //Write a program tha classifies a triangle based on its side lengths.
        //determine if the triange is equilateral(all sides are equal)
        //isosceles(exactly two sides are equal)
        //or scalene(no sides are equal)
        //use an if-else statement to classify the triangel
        //side1, side2, side 3 -> eq, iso, scalene

        //Logic Building
        //Step 1
        //Find the inputs / outputs
        //Input ? side1,side2,side3 --> data type --> double
        //output // SOP -> string or message -> Equailater, Isosceles, Scalene

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of side1");
        double side1 = sc.nextDouble();

        System.out.println("Enter the value of side2");
        double side2 = sc.nextDouble();

        System.out.println("Enter the value of side3");
        double side3 = sc.nextDouble();
        String triangle = "scalene";
        if (side1 < 0  || side2 <0  || side3 <0 ){
            System.out.println("Invalid input must be greater then or equal to zero");
        }else if(side1 >180 || side2 >180 || side3 > 180){
            System.out.println("Invalid input must be less then or equal to 180");

        }else {
            if (side1 == side2 && side1 == side3) {
                triangle = "equilateral";
                System.out.println("This is equilateral triangle");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                triangle = "isosceles";
                System.out.println("This is isosceles triangle");
            } else if (side1 != side2 && side1 != side3 && side2 != side3) {
                triangle = "scalene";
                System.out.println("This is scalene triangle");
            }
        }


        System.out.println("The given triangel is:"+triangle);
    }
}
