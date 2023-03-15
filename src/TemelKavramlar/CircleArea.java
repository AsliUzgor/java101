package TemelKavramlar;
import java.util.Scanner;
public class CircleArea {
    public static void main(String[] args){
        float pi = 3.14f;
        float r,alan,cevre,dilimAlan, a;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen yarıçapı giriniz: ");
        r = input.nextFloat();
        System.out.print("Lütfen merkez açı ölçüsünü giriniz: ");
        a = input.nextFloat();

        alan = pi*r*r;
        cevre = 2*pi*r;
        dilimAlan = (pi*(r*r)*a) / 360;

        System.out.println("Dairenin çevresi : " +cevre);
        System.out.println("Dairenin alanı : " +alan);
        System.out.println("Merkez açısı bilinen daire diliminin alanı : " +dilimAlan);

    }
}
