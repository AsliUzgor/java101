package KosulluIfadelerProje;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        int num1, num2, num3;
        System.out.println("******* HESAPLAMA MENÜSÜ *******");
        System.out.println("1) Toplama \n 2) Çıkartma \n 3) Çarpma \n 4) Bölme");
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen 1. sayıyı giriniz :");
        num1 = inp.nextInt();
        System.out.print("Lütfen 2. sayıyı giriniz :");
        num2 = inp.nextInt();
        System.out.print("Menüde yer alan işlemlerden yapmak istediğinizi seçiniz : ");
        num3 = inp.nextInt();

        switch (num3){
            case 1:
                System.out.println("Toplama işlemi sonucu : " + (num1 + num2));
                break;
            case 2:
                System.out.println("Çıkarma işlemi sonucu : " + (num1 - num2));
            case 3:
                System.out.println("Çarpma işlemi sonucu : " + (num1 * num2));
                break;
            case 4:
                if(num2 != 0){
                    System.out.println("Bölme işlemi sonucu : " + (num1 / num2));
                }else{
                    System.out.println("SAyı 0'a bölünemez");
                }
            default:
                System.out.println("Hatlı işlem seçtiniz ..");
        }

    }
}
