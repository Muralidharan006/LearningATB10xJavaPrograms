package ex_16_Array;

public class Lab142_Arrays {
    public static void main(String[] args) {
        int[] maarks = {1,2,3,4,5};
        //2nd way
        int[] marks2 = new int[5];// fixed size
        System.out.println(marks2.length);
        String s1 = "Pramod";
        System.out.println(s1.length());
        marks2[0]=45;
        marks2[1]=56;
        marks2[2]=76;
        marks2[3]=56;
        marks2[4]=66;
        System.out.println(marks2[0]);
        //System.out.println(marks2[10]);//error

    }
}
