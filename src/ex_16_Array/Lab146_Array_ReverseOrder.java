package ex_16_Array;

public class Lab146_Array_ReverseOrder {
    public static void main(String[] args) {
        //Print reverse order of an array

        int[] num = {1,2,3,4,5};
        for(int i = num.length-1; i>=0;i--){
            System.out.println(num[i]);
        }
    }
}
