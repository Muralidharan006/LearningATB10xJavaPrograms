package Java_Task;

import java.util.Scanner;

public class Check_if_a_Number_is_an_Armstrong_Number_30thJan {
    public static void main(String[] args) {
        //Getting value
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number....");
        int num = sc.nextInt();
        int originalnum = num;
        //Getting total digit count
        String str = Integer.toString(num);
        int n = str.length();
        int digit = 0;
        int Armstrongnum = 0;
        System.out.println("Total digit count is: "+n);
      for(int i = 1; i<=n;i++){
          digit = num%10;
          System.out.println(digit);
          Armstrongnum = (int)Math.pow(digit,n) + Armstrongnum;
          num = num/10;
      }
        System.out.println("The Armsrongnum is"+Armstrongnum);
      if(originalnum == Armstrongnum){
          System.out.println("Its an Armstrong number" +Armstrongnum);
      }else{
          System.out.println("Its not an Armstrong number");
      }
      sc.close();
    }
}
