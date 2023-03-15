package LoopsExamples;

public class PrimeNumber {
    public static void main(String [] args){
        int sayac = 0;
        int i = 1;
        for(i = 1 ; i <= 100 ; i++){
            for(int j = 2 ; j<i ; j++){
                if(i % j == 0){
                    sayac++;
                }
            }
           // sayac = 0;
        }
        if(sayac == 0){
            System.out.println(i);
        }
    }
}
