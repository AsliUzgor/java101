package LoopsExamples;

import java.util.Scanner;

public class PowOf4Or5 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int number;
        System.out.print("Bir sayı giriniz : ");
        number = inp.nextInt();

        for(int i = 1 ; i <= number; i*=4){
            System.out.println(i);
        }
        for (int j = 1 ; j <= number ; j*=5){
            System.out.println(j);
        }
    }
}
