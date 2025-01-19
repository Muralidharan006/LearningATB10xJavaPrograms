package ex_06_Ternary_Operator;

public class TO_Task_19thJAN {
    //*Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
    //
    //A: 90-100
    //
    //B: 80-89
    //
    //C: 70-79
    //
    //D: 60-69
    //
    //F: 0-59

    //Input = int, output = char
    //Logic building
//String result = (number > 10) ? (number > 20 ? ">20":"B 10 and 20"):"<10";

    public static void main(String[] args) {
        int mark = 89;
        //String Result = (mark<=59) ? "F":(mark<=69)?"D":(mark<=79)?"C":(mark<=89)?"B":(mark<=100)?"A";
        String Result = (mark<=59)? "F": ((mark<=69)?"D":(mark<=79)?"C":(mark<=89)?"B":"A");
        System.out.println(Result);
    }

}
