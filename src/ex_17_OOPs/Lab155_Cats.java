package ex_17_OOPs;

public class Lab155_Cats {
    public static void main(String[] args) {
        Cat c1 = new Cat();

        Cat c2 = null;
        c1.runing();
      //  c2.runing();//NullPointerException


    }
}

    class Cat{
      String name;

      void runing(){
          System.out.println("Running");
      }

    }

