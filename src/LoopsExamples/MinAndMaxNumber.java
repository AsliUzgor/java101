package LoopsExamples;

import java.util.Scanner;

public class MinAndMaxNumber {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int num, num1, max=0, min=0;
        System.out.print("girilecek sayı adeti : ");
        num = inp.nextInt();

        for(int i = 1 ; i<= num ; i++){
            System.out.print(i + ". Sayı : ");
            num1 = inp.nextInt();

            if(i == 1){
                min = num1;
                max = num1;
            }else if(num1 > max){
                max = num1;
            }else{
                min = num1;
            }
        }

        System.out.println("Min : " + min);
        System.out.println("Max : " + max);
    }
}
