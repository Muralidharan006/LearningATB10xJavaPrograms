package Java_Task;

import java.util.Scanner;

public class Convert_Days_into_Years_Months_and_Days_23 {
    public static void main(String[] args) {
        //*Convert Days into Years, Months, and Days.
        //
        //       :- Take the Days Input from the User
        //
        //    Define the conversion logic:
        //
        //        :- Assume 1 year = 365 days.
        //
        //        :- Assume 1 month = 30 days
        //
        //        :- Convert the Days into Years, Month and days and Print it.
        //
        //if you input 1000 days, the output of the program would be:  2 years, 9 months, and 0 days.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the days...!");
        int days = sc.nextInt();
int year = days/365; // years
int remaingdays = days%365; // remaining days exluding years
int months = remaingdays /30;
int day = remaingdays%30;
        System.out.println("Year "+year+"Months "+months+"days "+day);
        sc.close();
    }
}
