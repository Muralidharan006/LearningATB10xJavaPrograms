package ex_16_Array;

public class Lab145_Array_MaxValue {
    public static void main(String[] args) {
        /// Fine the max value in the array

        int[] array = {23,45,67,65,67,89,90,98,87};
        //Max,Min
        //Logic building
        //1-> inputs -array - > int
        //output --> int - 90
int max_output = give_max(array);
        System.out.println(max_output);
        int min_output = give_min(array);
        System.out.println(min_output);
    }

    static int give_max(int[] array){
        int max = array[0];
        for(int i =0; i<array.length;i++){
            if(array[i]>max){
                max = array[i];
            }
        }

        return max;
    }
    static int give_min(int[] array){
        int min = array[0];
        for(int i =0; i<array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
        }

        return min;
    }
}
