package ex_18_OOPs_constructor;

public class Lab157_DefCon {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        System.out.println(a2);
        System.out.println(a1);
    }
}

class A{

    A(){
        System.out.println("Hey hey");
    }
}
