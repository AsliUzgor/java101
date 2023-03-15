package LoopsExamples;

import java.util.Scanner;

public class PowOfNumber {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int num1, num2, numPow = 1;
        System.out.print("Üssü alınacak sayıyı giriniz : ");
        num1 = inp.nextInt();
        System.out.print("Üs olacak sayıyı giriniz : ");
        num2 = inp.nextInt();

        for(int i = 1 ; i<=num2 ; i++){
            numPow *= num1;
        }

        System.out.println("Sonuç : " + numPow);
    }
}
