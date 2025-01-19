package ex_06_Ternary_Operator;

public class Lab47_TO_AgeClassification {
    public static void main(String[] args) {
        int age = 25;
        //Adult, Minor, Senior
        //Senior > 65
        //Adult >18
        //Minor < 18

        String result = (age < 18) ? "Minor" : ((age > 65) ? "Senior":"Adult");
        System.out.println("The person comes under the classification: "+result);

    }
}
