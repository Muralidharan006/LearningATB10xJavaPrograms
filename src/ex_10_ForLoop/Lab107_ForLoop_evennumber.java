package ex_10_ForLoop;

public class Lab107_ForLoop_evennumber {
    public static void main(String[] args) {
        for(int i=0;i<=50;i++){
            if(i%2==0){
                System.out.println(i+"Even");
            }else continue; // it will skip the odd number
        }
    }
}
