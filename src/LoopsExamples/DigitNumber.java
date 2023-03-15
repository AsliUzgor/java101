package LoopsExamples;

import java.util.Scanner;

public class DigitNumber {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int number, basValue , result=0;
        System.out.print("Bir sayı giriniz: ");
        number = inp.nextInt();

        while(number != 0){
            basValue = number % 10;
           // System.out.println(basValue);
            number /= 10;
            result += basValue;
        }
        System.out.print("Girilen sayının basamak sayılarının toplamı : " + result);
    }
}
