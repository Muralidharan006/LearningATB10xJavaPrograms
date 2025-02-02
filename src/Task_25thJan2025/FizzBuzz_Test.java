package Task_25thJan2025;

public class FizzBuzz_Test {
    public static void main(String[] args) {

        //*Write a program that prints numbers from 1 to 100.
        // However, for multiples of 3, print "Fizz" instead of the number, and for multiples of 5, print "Buzz."
        // For numbers that are multiples of both 3 and 5, print "FizzBuzz."
        //(for loop, if else)
        //Logic building
        //I/O --> Input -> int, output. int and string
        //Logic
        //i%3==0 then "Fizz' , i%5==0 then "Buzz", i% 5==0 then "FizzBuzz"

        for(int i = 1; i<=100; i++){
            if(i%3==0){
                if(i%15==0){
                    System.out.println("FizzBuzz since it is multible by both 3 and 5: "+i);
                }else
                System.out.println("Fizz since it is multible by 3: "+i);
            }else if(i%5==0){
                System.out.println("Buzz since it is multible by 5: "+i);
//            }else if(i%15==0){
//                System.out.println("FizzBuzz since it is multible by both 3 and 5"+i);
            }else System.out.println("The value exlcusing fizz,Buzz,FizzBuzz: "+i);
        }
    }
}
