package ex_05_TypeCasting;

public class Lab38_TypeCasting {
    public static void main(String[] args) {
        //Implicit widening
        byte b = 10;
        int a = b; //Widening casting -- no data loss --Automatically done -- done by the compiler
    //Explicit widing we are telling compiler to caste
        byte b2 = 10;
        int a2 =(int) b2;

    }
}
