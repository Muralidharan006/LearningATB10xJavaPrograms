package ex_13_Functions;

public class Lab125_Userdefined_function_NoargAndNoreturn {
    public static void main(String[] args) {
        //Calling inside the main method to run it

        main();
        greet();
    }
    //Declaration / define
    //Without Parameters and Without Return Type.
    static void main(){
        System.out.println("Another look line of the main");
    }
    static void greet(){
        System.out.println("Hi, How are you");
    }
}
