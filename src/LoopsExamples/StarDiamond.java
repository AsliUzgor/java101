package LoopsExamples;

import java.util.Scanner;

public class StarDiamond {
    public static void main(String [ ] args){
        Scanner inp = new Scanner(System.in);
        int number;
        System.out.print("Bir sayı giriniz : ");
        number = inp.nextInt();

        for (int s = 1; s <= number; s++) {
            for (int e = 1; e <= (number - s); e++) {
                System.out.print(" ");
            }
            for (int r = 1; r <= (2 * s) - 1; r++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int k = number -1 ; k >= 1; k--) {
            for (int a = 1; a <= number-k; a++) {
                System.out.print(" ");
            }
            for (int n = 1; n <= (2 * k) - 1; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
