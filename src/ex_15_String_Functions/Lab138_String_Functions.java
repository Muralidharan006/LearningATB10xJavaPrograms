package ex_15_String_Functions;

public class Lab138_String_Functions {
    public static void main(String[] args) {
String str1 = "Hello";
// SCP, OA? // Creates or reuses "Hello" in string pool
        String str2 = "Hello"; // there are 1 string but 2 references
        String str3 = new String("Hello"); // Creats an new object in heap area

        //In case of string references they are pointing to same area
        System.out.println(str1 == str2); // reference
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3)); ///// It will check the contente
    }
}
