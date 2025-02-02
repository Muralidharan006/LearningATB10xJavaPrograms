package ex_13_Functions;

import java.util.Scanner;

public class Lab126_UserDefined_One {
    public static void main(String[] args) {
        //*### *User Defined Functions.**
        //1. Without Parameters and Without Return Type.
        //2. Without Parameters but With Return Type
        //3. With Parameters and Without Return Type
        //4. With Parameters and With Return Type

        //Without Parameters and Without Return Type.
        greet();
        //Without Parameters but With Return Type
        String s = greet_with_hello();
        System.out.println(s);

        int agetoVote = age_to_vote();
        System.out.println("Age to vote is: "+agetoVote);

        //With Parameters and Without Return Type == 90%
        greet_with_name("Murali"); //with single argument
        Scanner sc = new Scanner(System.in);
        String Firstname = "Muralidharan";
        String Lastname = "Dharmaraj";
        greet_with_Fullname("Muralidharan","Dharmaraj"); // with multiple arguments
        //With Parameters and With Return Type
        int sumvalue = sum_of_three_number(12,23,14);
        System.out.println(sumvalue);

    }
    //Without Parameters and Without Return Type.
    static void greet(){
        System.out.println("Hi hello 'Without Parameters and Without Return Type'");
    }
    //Without Parameters but With Return Type
    static String greet_with_hello(){
        return "Hi, How are you, I am example of 'Without Parameters but With Return Type'";
    }
    static int age_to_vote(){
        return 18;
    }
    //With Parameters and Without Return Type
    static void greet_with_name(String name){
        System.out.println("Your name is:"+name);
    }

    static void greet_with_Fullname(String Firstname, String Lastname){
        System.out.println("Your name is:"+Firstname+" "+Lastname);
    }
//With Parameters and With Return Type
    static int sum_of_three_number(int a, int b, int c){
        return (a+b+c);
    }

}
