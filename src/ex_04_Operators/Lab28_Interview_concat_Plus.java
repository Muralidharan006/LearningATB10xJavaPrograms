package ex_04_Operators;

public class Lab28_Interview_concat_Plus {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println(a+b);;

        String n1 = "Muralidharan";
        String n2 ="Dharmaraj";
        System.out.println(n1+n1);;
        //In case of int it will sum and in case of string it will concatantee


        //Interview question
        System.out.println(n1+n2+a+b);//MuralidharanDharmaraj1015 all of them will act like a string as per rule since first char is string
        System.out.println(a+b+n1+n2);//25MuralidharanDharmaraj since the first char is integral it sum the int values
        System.out.println(n1+n2+(a+b)); // use BODMAS


    }
}
