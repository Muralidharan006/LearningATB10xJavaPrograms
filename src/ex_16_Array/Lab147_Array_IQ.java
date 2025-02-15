package ex_16_Array;

import java.util.Arrays;

public class Lab147_Array_IQ {
    //Find the second largest num in the array
    public static void main(String[] args) {
        int[] num = {78,56,78,90,76,54,34,56};
        Arrays.sort(num);
        System.out.println(num[num.length-2]);
    }
}
