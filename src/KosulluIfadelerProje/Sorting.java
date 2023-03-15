package KosulluIfadelerProje;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args){
        int num1, num2, num3;
        Scanner inp = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz :");
        num1 = inp.nextInt();

        System.out.print("İkinci sayıyı giriniz : ");
        num2 = inp.nextInt();

        System.out.print("üçüncü sayıyı giriniz : ");
        num3 = inp.nextInt();

        if(num1<num2 && num1<num3){
            if (num2<num3){
                System.out.println("Küçükten büyüğe sıralama : "+num1+" < " +num2+" < "+num3);
            }else{
                System.out.println("Küçükten büyüğe sıralama : "+num1+" < " +num3+" < "+num2);
            }
        }else if( num2<num1 && num2<num3){
            if(num1<num3){
                System.out.println("Küçükten büyüğe sıralama : "+num2+" < " +num1+" < "+num3);
            }else{
                System.out.println("Küçükten büyüğe sıralama : "+num2+" < " +num3+" < "+num1);
            }
        }else{
            if(num1<num2){
                System.out.println("Küçükten büyüğe sıralama : "+num3+" < " +num1+" < "+num2);
            }else{
                System.out.println("Küçükten büyüğe sıralama : "+num3+" < " +num2+" < "+num1);
            }
        }
    }
}
