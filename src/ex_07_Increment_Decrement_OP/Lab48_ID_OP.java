package ex_07_Increment_Decrement_OP;

public class Lab48_ID_OP {


    public static void main(String[] args) {
        //Take inputs
        String age_String = args[0];
        int age = Integer.parseInt(age_String);
        System.out.println(age);
       String canIGOGoa = age>18 ? "Y":"N";
        System.out.println(canIGOGoa);
    }

}
