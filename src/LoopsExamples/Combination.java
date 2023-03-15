package LoopsExamples;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n , r, faktn = 1, faktr = 1 , comb, fakt = 1;
        System.out.print("Kombinasyonu hesaplanacak değeri giriniz ( C(n,r) ifadesindeki n değeri) : ");
        n = inp.nextInt();
        System.out.print("Kombinasyonu hesaplanacak değeri giriniz ( C(n,r) ifadesindeki r değeri) : ");
        r = inp.nextInt();

        // n! hesabı
        for(int i = 1 ; i <= n ; i++){
            faktn *= i ;
        }

        // r! hesabı
        for(int k = 1 ; k <= r ; k++){
            faktr *= k ;
        }

        for (int j = 1 ; j <= (n-r) ; j++){
            fakt *= j;
        }

        comb = faktn / (faktr * (fakt));
        System.out.println("Kombinasyon sonucu (C(n,r)) : " +comb);

    }
}
