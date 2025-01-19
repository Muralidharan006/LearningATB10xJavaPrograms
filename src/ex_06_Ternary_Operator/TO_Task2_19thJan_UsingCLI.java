package ex_06_Ternary_Operator;

public class TO_Task2_19thJan_UsingCLI {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt((args[1]));
        String theGreatestCLINumberIS = num1>num2 ? "num1 is greates" : num1<num2 ? "num2 is greatest" : "Both numbers are equal";
        System.out.println(theGreatestCLINumberIS);
    }
}
