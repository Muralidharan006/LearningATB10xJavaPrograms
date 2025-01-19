package ex_06_Ternary_Operator;

public class TO_Task2_19thJAN_FindTheLargestOfThreeNumber {
    public static void main(String[] args) {
        int num1 = 33;
        int num2 = -87;
        int num3 = 77;
        String theLargestNumberIs = ((num1>=num2) && (num1>=num3)) ? "Num1" :
                ((num2>=num3)) ? "Num2" : "Num3";
        System.out.println("The Largest number is:"+ theLargestNumberIs);
    }

}
