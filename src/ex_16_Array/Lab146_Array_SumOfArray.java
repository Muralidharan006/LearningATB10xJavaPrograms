package ex_16_Array;

public class Lab146_Array_SumOfArray {
    public static void main(String[] args) {
        int[] num = {3,4,56,78,90,67};
        int sum = 0;
        for(int i =0;i<= num.length-1;i++){
            sum = num[i]+ sum;
        }
        System.out.println(sum);
        System.out.println("----------For each loop----------");
        for(int n: num){
           sum = sum +n;
        }
        System.out.println(sum);
    }
}
