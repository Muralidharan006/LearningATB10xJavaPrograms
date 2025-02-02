package ex_09_Switch;

import java.util.Scanner;

public class Lab092_Switch_InterviewQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = sc.next();

        switch (browser){
            case "chrome":
                System.out.println("Execute chrome browser");
                break;
            case "Edge":
                System.out.println();
                break;
            case "Firefox":
                System.out.println("Execute firefox browser");
                break;
            default:
                System.out.println("Incorrect input");

        }
    }
}
