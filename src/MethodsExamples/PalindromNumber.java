package MethodsExamples;

import java.util.Scanner;

public class PalindromNumber {

    static boolean isPalindrom(int number){

        int temp = number, lastNumber, reverseNumber = 0;

        while(temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber*10) + lastNumber;
            temp /= 10 ;
        }

        if(reverseNumber == number){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        int number ;
        Scanner inp = new Scanner(System.in);
        System.out.println("bir sayı giriniz : ");
        number = inp.nextInt();
        System.out.println(isPalindrom(number));
    }
}
