package ex_18_OOPs_constructor;

import java.util.Scanner;

public class Lab165_Const {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the model");
        String model = sc.next();
        Car2 tesls = new Car2(model,2030);
        System.out.println(tesls.model);
        System.out.println(tesls.year);

        Car2 tatanano = new Car2("Tata Nano",2014);
        System.out.println(tatanano.model);
        System.out.println(tatanano.year);
     }
}
