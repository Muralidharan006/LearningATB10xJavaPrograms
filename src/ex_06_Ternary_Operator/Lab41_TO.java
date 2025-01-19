package ex_06_Ternary_Operator;

public class Lab41_TO {
    public static void main(String[] args) {
        //result = condition ? expersion1(if true) : expersion2(else false);
        int age = 18;
        String canIvote = age > 18 ? "Yes, you can vote" : "No, You can't vote";
        System.out.println(canIvote);
    }
}
