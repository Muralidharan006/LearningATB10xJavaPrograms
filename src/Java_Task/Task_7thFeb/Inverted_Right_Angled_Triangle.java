package Java_Task.Task_7thFeb;

public class Inverted_Right_Angled_Triangle {
    public static void main(String[] args) {
        //* * * * *
        //* * * *
        //* * *
        //* *
        //*
        int[][] a = new int[5][5];
        System.out.println(a.length);
        for (int i = 5; i <= a.length; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            if(i==1){break;}
        }


    }
}
