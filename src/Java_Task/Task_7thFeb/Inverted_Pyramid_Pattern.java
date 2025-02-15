package Java_Task.Task_7thFeb;

public class Inverted_Pyramid_Pattern {
    public static void main(String[] args) {
     //total row 5 ---int n = 5
     //9 =
        int n =5;
        for(int i =5;i<=n;i--){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
            if(i==1){
                break;
            }
        }


    }
}