package KosulluIfadelerProje;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] ars){
        Scanner inp = new Scanner(System.in);
        int year;
        System.out.print("Yılı giriniz : ");
        year = inp.nextInt();

        if(year % 4 == 0){
            if(year % 100 == 0){
                if (year % 400 == 0){
                    System.out.println("Girdiğiniz yıl artık yıldır.");
                }else{
                    System.out.println("Girdiğiniz yıl artık yıl değildir.");
                }
            }else{
                System.out.println("Girdiğiniz yıl artık yıldır.");
            }
        }else{
            System.out.println("Girdiğiniz yıl artık yıl değildir.");
        }
    }

}
