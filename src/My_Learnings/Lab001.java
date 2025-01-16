package My_Learnings;

import java.sql.SQLOutput;

//Question
//Write a program to create a class called Lab001 with attributes brand, model, and price.
//Initialize the attributes using a constructor and create an object to display its details.
public class Lab001 {
    String brand;
    String model;
    int price;
    Lab001(String brand, String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    void display(){
        System.out.println("Mobile details");
        System.out.println("brand =" +brand);
        System.out.println("model =" +model);
        System.out.println("price =" +price);
    }

    public static void main(String[] args) {
        Lab001 mobile = new Lab001("Apple","16Promax",156000);
        mobile.display();
    }
}
