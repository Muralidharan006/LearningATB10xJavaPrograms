package ex_10_ForLoop;

public class Lab106_Forloop_continue {
    public static void main(String[] args) {
        for(int i=0; i<20; i++){
            if(i==5) continue; // it will skip 5 and it will go to top

            System.out.println("print"+i);
        }
    }
}
