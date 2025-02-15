package ex_16_Array;

import java.util.Arrays;

public class Lab144_Array {
    public static void main(String[] args) {
        int[] marks = {56,34,56,78,90};
        System.out.println(marks.length);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
       Arrays.sort(marks);//to rearrange in increasing order
    }
}
