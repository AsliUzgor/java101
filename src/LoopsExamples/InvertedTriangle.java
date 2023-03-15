package LoopsExamples;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int num;
        System.out.println("Bir sayı giriniz :");
        num = inp.nextInt();

        for (int i = num -1 ; i >= 1; i--) {
            for (int j = 1; j <= num-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
