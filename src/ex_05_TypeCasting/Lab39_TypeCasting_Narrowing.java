package ex_05_TypeCasting;

public class Lab39_TypeCasting_Narrowing {

    public static void main(String[] args) {
        int val = 200;
      //  byte b22 = val; //Implicate narrowing casting is not possible
       // System.out.println(b22);

        byte b23 =(byte)val;
        System.out.println(b23);
    }
}
