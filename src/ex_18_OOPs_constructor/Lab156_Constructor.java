package ex_18_OOPs_constructor;

public class Lab156_Constructor {
    public static void main(String[] args) {
Baby bae = new Baby();
new Baby();
new Baby();
    }
}

class Baby{
    String name;

    //Default constructor is also called
    Baby(){
        System.out.println("I am called object is creataed");
    }
    //Instance Initialization block

    {
        System.out.println("hey ");
    }
        }
