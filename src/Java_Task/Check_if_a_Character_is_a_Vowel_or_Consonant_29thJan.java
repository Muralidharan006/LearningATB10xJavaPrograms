package Java_Task;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Check_if_a_Character_is_a_Vowel_or_Consonant_29thJan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet.....");
        char alphabet = sc.next().charAt(0);
        System.out.println(alphabet);
        char Vowles[] = {'a','e','i','o','u'};
        int i=0;
        if(1==1){
            for(;Vowles.length>i;i++){
                //System.out.println(i);
                if(alphabet == Vowles[i]){
                    System.out.println("The given letter is a vowel");
                    break;
                }else if(i==4){
                    System.out.println("The given letter is a Consonent");
                }
        }
  }


    }
}
