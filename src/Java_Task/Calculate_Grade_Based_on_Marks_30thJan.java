package Java_Task;

import java.util.Scanner;

public class Calculate_Grade_Based_on_Marks_30thJan {
    //*1️⃣ Take user input for marks (Use Scanner class).
    //2️⃣ Check the validity of marks (ensure they are between 0 and 100).
    //3️⃣ Use if-else-if conditions to determine the grade based on marks.
    //4️⃣ Display the grade as output.
    //
    //📌 Grading Criteria (Example)
    //
    //Marks Range Grade
    //
    //90 - 100   A+
    //
    //80 - 89     A
    //
    //70 - 79      B
    //
    //60 - 69     C
    //
    //50 - 59      D
    //
    //40 - 49      E
    //
    //Below 40   Fail
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the mark....");
        int mark = sc.nextInt();
        char grade = 'E';
        if(mark>=0 && mark<=100){
            if(mark>=90 && mark<=100){
                System.out.println("A+");
            }
            else if(mark>=80 && mark<=89){
                System.out.println("A");
            }
            else if(mark>=70 && mark<=79){
                System.out.println("B");
            }
            else if(mark>=60 && mark<=69){
                System.out.println("C");
            }
            else if(mark>=50 && mark<=59){
                System.out.println("D");
            }
            else if(mark>=40 && mark<=49){
                System.out.println("E");
            }
            else{
                System.out.println("Fail");
            }
        }

    }



}
