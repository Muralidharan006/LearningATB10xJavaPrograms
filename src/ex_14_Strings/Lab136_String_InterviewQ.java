package ex_14_Strings;

public class Lab136_String_InterviewQ {
    public static void main(String[] args) {

        String s1 = "Hello";//SCP =1
        String s4 = "Hello";//1

        String s2 = new String("Hello");
        String s3 = new String("hello");

        //==? Comparasion -->This check the locations ref

        System.out.println(s1 == s3);//false
        System.out.println(s1 == s2);//false
        System.out.println(s2 == s3);//false
        System.out.println(s1==s4);//True



        // equal( content) ->value

        //How can I check the values are equal?
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s3)); // case insesivity
    }
}
