package ex_15_String_Functions;

public class Lab139_String_Functions {
    public static void main(String[] args) {
        String name = "Sonal";
        System.out.println(name.length());//5
        System.out.println(name.charAt(3));//a // Start from index 0
       // System.out.println(name.charAt(10));//StringOutOfBoundException
        System.out.println(name.concat("patel"));
        System.out.println(name.contains("So"));
        System.out.println(name.equals("Sonal"));
        System.out.println(name.equalsIgnoreCase("sonal"));
        System.out.println(name.indexOf('a'));//3
        System.out.println(name.replace('n','N'));
        System.out.println(name); //Sonal
        String name2 = "Muralidharan@Dharmaraj@123";
        String[] split=name2.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        System.out.println(name2.substring(4,9));//begining index will be same end index will be n-1
        System.out.println(name2.toUpperCase());
        System.out.println(name2.toLowerCase());
        System.out.println(name2.startsWith("M"));
        System.out.println(name2.endsWith("3"));
        String name3 =" Murali ";
        System.out.println(name3.trim());
        System.out.println(name3.compareTo(" Murali "));//if true 0 // lexographically
        /// Sting Builder

        StringBuilder strbuild = new StringBuilder("Sonali");
       strbuild.append("Patel");
        System.out.println(strbuild);

    }
}
