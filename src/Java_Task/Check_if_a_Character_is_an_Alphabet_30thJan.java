package Java_Task;

import java.util.Scanner;

public class Check_if_a_Character_is_an_Alphabet_30thJan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet");
        char character = sc.next().charAt(0);
      if(Character.isLetter(character)){
          System.out.println("Its an alphabet");
      }else{
          System.out.println("Its not an alphabet");
      }
      sc.close();

    }
}
