package ex_10_ForLoop;

public class Lab104_forLoop_InterviewQuestion {
    public static void main(String[] args) {
        //To find the even number from 1 t0 50

        for(int i= 0; i<=50; i++){
            if(i%2==0){
                System.out.println(i+ ",is an even number");
            }else System.out.println(i+ ",is an Odd number");

        }
    }
}
