package Java_Task;

import java.util.Scanner;

public class Check_if_a_Triangle_is_Valid_Based_on_Three_Sides_30thJan {
    public static void main(String[] args) {
//*To check if a triangle is valid based on its three sides, use the triangle inequality theorem.
// The theorem states that for any triangle,
// the sum of the lengths of any two sides must be greater than the length of the third side
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side 1 value...");
        int side1 = sc.nextInt();
        System.out.println("Enter side 2 value...");
        int side2= sc.nextInt();
        System.out.println("Enter side 3 value...");
        int side3 = sc.nextInt();

        if(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1){
            System.out.println("It's a valid triangle");
        } else {
            System.out.println("It's not a valid triangle");
        }

sc.close();
    }
}
