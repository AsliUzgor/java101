package KosulluIfadelerProje;

import java.util.Scanner;

public class Activities {
    public static void main(String[] args){

        int heat;
        Scanner inp = new Scanner(System.in);

        System.out.println("Hava sıcaklık derecesini giriniz : ");
        heat = inp.nextInt();

        if(heat<5){
            System.out.println("Kayak yapabilirsiniz..");
        }else if(heat > 5 && heat < 15){
            System.out.println("Sinemaya gidebilirisiniz ..");
        }else if(heat > 15 && heat < 25){
            System.out.println("Pikniğe gidebilirsiniz ..");
        }else{
            System.out.println("Yüzeye gidebilirsiniz..");
        }
    }
}
