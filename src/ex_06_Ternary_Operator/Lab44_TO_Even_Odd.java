package ex_06_Ternary_Operator;

public class Lab44_TO_Even_Odd
{
    public static void main(String[] args) {
        int num = 9;
       // String result = (num%2 == 0) ? "its even" : "its odd";
        String result = (num%2 != 0) ? "its even" : "its odd";
        System.out.println(result);

    }
}
