package ex_12_DoWhile;

public class Lab111_DoWhile {


    public static void main(String[] args) {



        int a = 0;
        while(a>10){ // Entry controled
            System.out.println(a);
            a++;
        }
        do{ //Exit controled
            System.out.println("print"+a);
            a++;
        }while(a>10);
    }
}
