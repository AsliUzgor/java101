package LoopsExamples;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){

        // 0,1,1,2,3,5,8,13.......
        Scanner inp = new Scanner(System.in);
        int num;
        int result = 0;
        int num1 = 0 ;
        int num2 = 1 ;
        System.out.println("Bir sayı giriniz :");
        num = inp.nextInt();

        for(int i = 1 ; i <= num ; i++){
            System.out.println(num1);
            result = num1 + num2;
            num1 = num2 ;
            num2 = result;

        }



    }
}
