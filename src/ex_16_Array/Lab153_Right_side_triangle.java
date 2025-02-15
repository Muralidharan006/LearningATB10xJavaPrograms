package ex_16_Array;

import java.util.Scanner;

public class Lab153_Right_side_triangle {
    public static void main(String[] args) {
        //*
        //**
        //***
        //****
        //*****
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number in interger only");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0 ;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
