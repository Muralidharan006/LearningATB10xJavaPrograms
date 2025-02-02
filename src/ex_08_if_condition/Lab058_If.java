package ex_08_if_condition;

public class Lab058_If {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if(age>18){
            System.out.println("You are allowed to vote!");
        }else{
            System.out.println("You are not allowed to vote!");
        }
    }
}
