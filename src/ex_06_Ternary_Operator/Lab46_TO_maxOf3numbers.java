package ex_06_Ternary_Operator;

public class Lab46_TO_maxOf3numbers {
    public static void main(String[] args) {
       //Finding the largest number , n1, n2, n3 = max(n1,n2,n3)
       //Step 1: Logic building - find inputs and outpus
       //n1,n2,n2 -> data type -> int
        //o/p -> int
        //23,34,10 -> 34

        // step 2: rough logic
        //n1 >= n2
        //n1>=n2 --> Y : N
        //Y -> n1 >= n3 : Y (n1) : N(n3)

        int num11 = 20;
        int num12 = 45;
        int num13 = -12;

        int MaxNumResult = (num11>=num12)?((num11>=num13 ? num11 : num13)) : ((num12>=num13)?num12:num13);
        System.out.println("Largest number is:"+MaxNumResult);

    }
}
