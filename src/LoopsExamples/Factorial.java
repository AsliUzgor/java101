package LoopsExamples;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int number, fakt = 1;
        System.out.println("Bir sayı giriniz : ");
        number = inp.nextInt();

        for(int i = 1 ; i <= number ; i++){
            fakt *= i ;
        }

        System.out.println(fakt);
    }
}
