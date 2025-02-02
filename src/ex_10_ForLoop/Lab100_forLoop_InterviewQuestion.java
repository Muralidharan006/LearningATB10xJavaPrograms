package ex_10_ForLoop;

public class Lab100_forLoop_InterviewQuestion {
    public static void main(String[] args) {
        for(int Murali = 0; Murali<19; Murali++)
        {
            if(Murali<18){
                System.out.println("He can't vote");
            }else{
                System.out.println("He can vote"); // the moment he reach he can vote
            }
        }
    }
}
