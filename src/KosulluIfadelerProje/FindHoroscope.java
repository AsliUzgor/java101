package KosulluIfadelerProje;

import java.util.Scanner;

public class FindHoroscope {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int day, month ;
        System.out.print("Doğduğunuz günü giriniz : ");
        day = inp.nextInt();
        System.out.print("Doğduğunuz ayı (rakam olarak) giriniz : ");
        month = inp.nextInt();

        if(month == 1){
            if(day >= 1 && day<= 21){
                System.out.println("Oğlak burcusunuz.");
            }else{
                System.out.println("Kova burcusunuz.");
            }
        }else if(month == 2){
            if (day >= 1 && day <= 19) {
                System.out.print("Kova bursunuz.");
            }else{
                System.out.print("Balık burcusunuz.");
            }
        }else if(month == 3){
            if(day >=1 && day <= 20){
                System.out.print("Balık burcusunuz.");
            }else{
                System.out.print("Koç burcusunuz.");
            }
        }else if(month == 4){
            if (day >= 1 && day <= 20) {
                System.out.print("Koç bursunuz.");
            }else{
                System.out.print("Boğa burcusunuz.");
            }
        }else if(month == 5){
            if(day >= 1 && day <= 21){
                System.out.print("Boğa burcusunuz.");
            }else{
                System.out.print("İkizler burcusunuz.");
            }
        }else if(month == 6){
            if (day >= 1 && day <= 22) {
                System.out.print("İkizler bursunuz.");
            }else{
                System.out.print("Yengeç burcusunuz.");
            }
        }else if(month == 7){
            if(day >= 1 && day <= 23){
                System.out.print("Yengeç burcusunuz.");
            }else{
                System.out.print("Aslan burcusunuz.");
            }
        }else if(month == 8){
            if (day >= 1 && day <= 22) {
                System.out.print("Aslan bursunuz.");
            }else{
                System.out.print("Başak burcusunuz.");
            }
        }else if(month == 9){
            if(day >= 1 && day <= 22){
                System.out.print("Başak burcusunuz.");
            }else{
                System.out.print("Terazi burcusunuz.");
            }
        }else if(month == 10){
            if (day >= 1 && day <= 22) {
                System.out.print("Terazi bursunuz.");
            }else{
                System.out.print("Akrep burcusunuz.");
            }
        }else if(month == 11){
            if(day >= 1 && day <= 21){
                System.out.print("Akrep burcusunuz.");
            }else{
                System.out.print("Yay burcusunuz.");
            }
        }else if(month == 12){
            if (day >= 1 && day <= 21) {
                System.out.print("Yay bursunuz.");
            }else{
                System.out.print("Oğlak burcusunuz.");
            }
        }else{
            System.out.println("Geçersiz değerler girdiniz..");
        }
    }
}
