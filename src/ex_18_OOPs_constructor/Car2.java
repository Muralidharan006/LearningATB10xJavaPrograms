package ex_18_OOPs_constructor;

public class Car2 {
    String model;
    int year;
    Car2(){
        System.out.println("DC");
    }
    Car2(String model_name,int year_created){
        this.model = model_name;
        this.year = year_created;
    }
}
