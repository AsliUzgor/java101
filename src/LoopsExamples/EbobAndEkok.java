package LoopsExamples;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EbobAndEkok {
    public static void main(String [] args){
        Scanner inp = new Scanner(System.in);
        int num1 , num2, ebob = 1, ekok = 1;
        System.out.print("Birinci sayıyı giriniz : ");
        num1 = inp.nextInt();
        System.out.print("Ikinci sayıyı giriniz : ");
        num2 = inp.nextInt();

        for(int i =1 ; i <= num1 ; i++){
            if(num1 % i == 0 && num2 % i == 0){
                ebob = i;
             //   System.out.println(i);
            }
        }

        for (int j = num1 ; j<= 1 ; j--){
            if (num1 % j == 0 && num2 % j ==0){
                ekok = j;
             //   System.out.println(j);
            }
        }

        System.out.println("Ebob : " +ebob);
        System.out.println("Ekok : " + ekok);
    }
}
