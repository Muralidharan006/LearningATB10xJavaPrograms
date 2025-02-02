package Java_Task;

import java.util.Scanner;

public class Check_if_a_Number_is_a_Palindrome_31stJan {
    public static void main(String[] args) {
        //*Step 1: reversedNum = 0, number = 123
        //Extract last digit: 123 % 10 = 3
        //New reversedNum = 0 * 10 + 3 = 3
        //Remove last digit: 123 / 10 = 12

        //Step 2: reversedNum = 3, number = 12
        //Extract last digit: 12 % 10 = 2
        //New reversedNum = 3 * 10 + 2 = 32
        //Remove last digit: 12 / 10 = 1
        //Step 3: reversedNum = 32, number = 1
        //Extract last digit: 1 % 10 = 1
        //New reversedNum = 32 * 10 + 1 = 321
        //Remove last digit: 1 / 10 = 0
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number....");
        int num = sc.nextInt();
        int OriginalNum = num;
        String numstr = Integer.toString(num);
        //To get the digit length
        int numcount = numstr.length();
        System.out.println(numcount);

        //initialization
     //   int reversedNum = 0;
        int NewReversedNum = 0;
        for (int i = 0; numcount > i; i++) {
            //Extract last digit
            int ExtractingLastDigit = num % 10;
            NewReversedNum = NewReversedNum * 10 + ExtractingLastDigit;
            num = num / 10;
        }
        System.out.println("The new reversed num is" + NewReversedNum);
        if (OriginalNum == NewReversedNum) {
            System.out.println("Its a Palindrome");
        } else {
            System.out.println("Its not a Palindrome");
        }
        sc.close();
    }
}
