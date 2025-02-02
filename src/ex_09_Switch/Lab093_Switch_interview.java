package ex_09_Switch;

public class Lab093_Switch_interview {
    public static void main(String[] args) {
        char ch = 'A'; // 65

        switch (ch){
            case 65:
                System.out.println("correct value");
                break;
            default:
                System.out.println("incorrect value");
        }

        //*boolean b = true
        //switch (b) {} // not valid

        long a11 = 98l;
        switch((int)a11){
            case 98:
                System.out.println("values");
                break;
           // case 98: // same values are not allowed
             //   System.out.println("value");
        } // with wrapper long is possible
    }

}
