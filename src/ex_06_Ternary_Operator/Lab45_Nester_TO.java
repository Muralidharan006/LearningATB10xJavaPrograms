package ex_06_Ternary_Operator;

public class Lab45_Nester_TO {
    //Nested Ternary


    public static void main(String[] args) {

        int number = 15;
        String result = (number > 10) ? (number > 20 ? ">20":"B 10 and 20"):"<10";
        System.out.println(result);
    }

}
