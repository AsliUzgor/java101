package LoopsExamples;

import java.util.Scanner;

public class EvenAndMultiplesOf4 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int number, sum = 0;

        while(true){
            System.out.print("Lütfen bir sayı giriniz : ");
            number = inp.nextInt();
            if(number % 2 == 0 && number % 4 == 0){
                sum += number;
            }
            if(number % 2 != 0){
                break;
            }
        }
        System.out.println("Girilen değerler arasında çift ve 4'ün katı olan sayıların toplamı : " + sum);
    }
}
