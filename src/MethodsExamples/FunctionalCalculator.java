package MethodsExamples;

import java.util.Scanner;

public class FunctionalCalculator {
    public static void Sum(){
        int result = 0 , number;
        Scanner inp = new Scanner(System.in);
        for(int i = 1 ; i>0 ; i++){
            System.out.print(i + ". Sayı : ");
            number = inp.nextInt();
            result += number;
            if(number == 0){
                break;
            }
        }
        System.out.println("Sonuç : " +result);
    }

    public static void Minus(){
        int num1, result = 0 ;
        Scanner inp = new Scanner(System.in);
        for(int i = 1; i> 0 ; i++){
            System.out.println(i + ".Sayı : ");
            num1 = inp.nextInt();
           if(i == 1){
               result += num1;
               continue;
           }
            if(num1 == 0){
                break;
            }
            result -= num1 ;
        }
        System.out.println("Sonuç : " + result);
    }

    public static void Multipli(){
        int num1 , result = 1 , count;
        Scanner inp = new Scanner(System.in);
        System.out.println("Girilecek sayı adeti : ");
        count = inp.nextInt();
        for (int i = 1 ; i<=count ; i++){
            System.out.println(i + ". Sayı : ");
            num1 = inp.nextInt();
            if (num1 == 0){
                result = 0;
                break;
            }
            result *= num1 ;
        }
        System.out.println("Sonuç : " +result);
    }

    public static void Divided(){
        double num1 , result =0.0 ;
        Scanner inp = new Scanner(System.in);
        System.out.println("Girilecek sayı adedi : ");
        double count = inp.nextDouble();
        for (int i = 1 ; i <= count ; i++){
            System.out.println(i + ". Sayı : ");
            num1 = inp.nextDouble();
            if(i != 1 && num1 == 0){
                System.out.println("Sayı sıfıra bölünemez.");
                continue;
            }
            if(i == 1){
                result = num1;
                continue;
            }
            result /= num1;
        }
        System.out.println("Sonuç : " +result);
    }

    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int select ;
        System.out.println("********* İŞLEM MENÜSÜ *********");
        System.out.println("1) Toplama \n" +
                "2) Çıkartma \n" +
                "3) Çarpma \n" +
                "4) Bölme \n" +
                "5) Üslü Sayı Hesaplama \n" +
                "6) Faktöriyel Hesaplama \n" +
                "7) Mod Alma \n" +
                "8) Dikdörtgen Çevre ve Alan Hesaplama");

        while(true){
            System.out.print("Yapmak istediğiniz işlemi seçiniz :");
            select = inp.nextInt();

            switch (select){
                case 1:
                    Sum();
                    break;
                case 2:
                    Minus();
                    break;
                case 3:
                    Multipli();
                    break;
                case 4:
                    Divided();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Hatalı değer girdiniz..");
            }

        }

    }
}