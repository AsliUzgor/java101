package KosulluIfadelerProje;

import java.util.Scanner;

public class PlaneTicket {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        double km, age, total, discountTotal, discount, doubleDiscount, ticketDiscount, finalTotal;
        int ticket;
        System.out.print("Gideceğiniz mesafeyi km cinsinden giriniz : ");
        km = inp.nextDouble();

        if(km <= 0 ){
            System.out.println("Hatalı veri girdiniz. İşleminiz iptal edildi.");
        }else{
            System.out.print("Yaşınızı giriniz : ");
            age = inp.nextDouble();
            System.out.print("Bilet türünüzü giriniz : \n 1) Gidiş \n 2) Gidiş - Dönüş \n");
            ticket = inp.nextInt();

            switch (ticket){
                case 1:
                    if(age >= 1 && age < 12){
                        total = km * 0.10;
                        discount = total * 0.50;
                        discountTotal = total - discount;
                        System.out.println("Normal Fiyat : " +total);
                        System.out.print("İndirimli fiyat : " +discountTotal);
                    }else if(age >= 12 && age < 24){
                        total = km * 0.10;
                        discount = total * 0.10;
                        discountTotal = total - discount;
                        System.out.println("Normal Fiyat : " +total);
                        System.out.print("İndirimli fiyat : " +discountTotal);
                    }else if(age >= 65){
                        total = km * 0.10;
                        discount = total * 0.30;
                        discountTotal = total - discount;
                        System.out.println("Normal Fiyat : " +total);
                        System.out.print("İndirimli fiyat : " +discountTotal);
                    }else{
                        total = km * 0.10;
                        System.out.print("Toplam Fiyat : " +total);
                    }
                    break;
                case 2:
                    if(age >= 1 && age < 12){
                        total = km * 0.10;
                        discount = total * 0.50;
                        discountTotal = total - discount;
                        ticketDiscount = discountTotal * 0.20;
                        doubleDiscount = discountTotal - ticketDiscount;
                        finalTotal = 2 * doubleDiscount;
                        System.out.print("İndirimli fiyat : " +finalTotal);
                    }else if(age >= 12 && age < 24){
                        total = km * 0.10;
                        discount = total * 0.10;
                        discountTotal = total - discount;
                        ticketDiscount = discountTotal * 0.20;
                        doubleDiscount = discountTotal - ticketDiscount;
                        finalTotal = 2 * doubleDiscount;
                        System.out.print("İndirimli fiyat : " +finalTotal);
                    }else if(age >= 65){
                        total = km * 0.10;
                        discount = total * 0.30;
                        discountTotal = total - discount;
                        ticketDiscount = discountTotal * 0.20;
                        doubleDiscount = discountTotal - ticketDiscount;
                        finalTotal = 2 * doubleDiscount;
                        System.out.print("İndirimli fiyat : " +finalTotal);
                    }else{
                        total = km * 0.10;
                        ticketDiscount = total * 0.20;
                        discountTotal = total - ticketDiscount;
                        finalTotal = 2 * discountTotal;
                        System.out.println("İndirimli Fiyat : " +finalTotal);
                    }
                    break;
                default:
                    System.out.println("Hatalı yön girdiniz..");
            }
        }
    }
}
