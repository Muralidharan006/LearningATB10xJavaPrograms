package ex_04_Operators;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Lab25_Operators
{
    public static void main(String[] args) {
        //Assignment operator
        //*1.
        //    1. `+`   (Addition)
        //    2. `-`   (Subtraction)
        //    3. `*`   (Multiplication)
        //    4. `/`   (Division)
        //    5. `%`   (Modulo)

        int  a = 20;
        int b = 3;
        float c = 3f;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b); //6
        System.out.println(a/c); //6.666665
        System.out.println(a%b);

    }

}
