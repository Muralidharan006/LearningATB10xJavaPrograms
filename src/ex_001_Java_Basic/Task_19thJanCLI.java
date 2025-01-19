package ex_001_Java_Basic;

public class Task_19thJanCLI {
    public static void main(String[] args) {
        //Take a user input - Name, Age and Salary and print them in the end.
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        int Salary = Integer.parseInt((args[2]));
        System.out.println("The Persone name is:"+name+",and his age is:"+age+".Currently he is earning:"+Salary);
    }
}
