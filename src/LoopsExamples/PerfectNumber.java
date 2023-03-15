package LoopsExamples;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int num, result = 0;
        System.out.println("Bir sayı giriniz: ");
        num = inp.nextInt();

        for (int i = 1 ; i<num ; i++){
            if(num %i == 0){
                result += i;
                //System.out.println(i);
            }
        }

        if(result == num){
            System.out.println("Mükemmel sayıdır. ");
        }else if(result == 1) {
            System.out.println("Mükemmel sayı değildir");
        }else{
            System.out.println("Mükemmel sayı değildir. ");
        }

    }
}
