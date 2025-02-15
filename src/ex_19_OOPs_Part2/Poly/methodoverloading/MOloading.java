package ex_19_OOPs_Part2.Poly.methodoverloading;

import org.w3c.dom.ls.LSOutput;

public class MOloading {


    public static void main(String[] args) {
        MathOperations m1 = new MathOperations();
        int r = m1.add(3,5);
        System.out.println(r);

        int r1 = m1.add(5,6,8);
        System.out.println(r1);

        double r2 = m1.add(5.09,8.998);
        System.out.println(r2);

    }
}
