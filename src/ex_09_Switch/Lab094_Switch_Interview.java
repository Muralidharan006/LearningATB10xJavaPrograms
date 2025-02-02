package ex_09_Switch;

public class Lab094_Switch_Interview {
    public static void main(String[] args) {
        int itemcode = 003; // java>13
        switch (itemcode){
            case 001,002,003: //IQ: Multiple inputs are possible
                System.out.println("All of them are electronic gadged");
                break;
            case 004,005,006:
                System.out.println("This is Mech");
                break;
            default:
                System.out.println("end");

        }
    }
}
