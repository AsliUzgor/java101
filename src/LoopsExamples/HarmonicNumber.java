package LoopsExamples;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        double number, result = 0 ;
        System.out.print("Bir sayı giriniz : ");
        number = inp.nextDouble();

        for(double i = 1 ; i<= number ; i++){
            result += 1 / i;
        }
        System.out.println(result);
    }
}
