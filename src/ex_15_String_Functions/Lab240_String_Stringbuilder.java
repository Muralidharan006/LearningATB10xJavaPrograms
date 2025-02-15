package ex_15_String_Functions;

public class Lab240_String_Stringbuilder {
    public static void main(String[] args) {
       StringBuffer stringbuffer = new StringBuffer("Murali");
       stringbuffer.append("dharan");
        System.out.println(stringbuffer);
        stringbuffer.reverse();
        System.out.println(stringbuffer);
        stringbuffer.append("Work");
        System.out.println(stringbuffer);
    }
}
