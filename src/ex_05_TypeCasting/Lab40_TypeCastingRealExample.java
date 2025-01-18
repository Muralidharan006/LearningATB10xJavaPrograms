package ex_05_TypeCasting;

public class Lab40_TypeCastingRealExample {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
        //int total_int = course+ GST; // Narrowing implicit
        int total_int = course+(int)GST;//Narrowing explicit not advisable
        float total = course + GST; //Widening implicit
        float total_float = (float)course+GST; //Widening explicit
        System.out.println(total_float);
    }
}
//ternar, increment, decrement, conditions of if, else, loops
