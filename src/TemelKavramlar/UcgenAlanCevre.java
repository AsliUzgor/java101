package TemelKavramlar;
import java.util.Scanner;

public class UcgenAlanCevre {
    public static void main(String[] args){
        double k1, k2, k3, alan, cevre, u;
        Scanner inp = new Scanner(System.in);
        System.out.print("Üçgenin birinci kenarını giriniz: ");
        k1 = inp.nextDouble();
        System.out.print("Üçgenin ikinci kenarını giriniz: ");
        k2 = inp.nextDouble();
        System.out.print("Üçgenin üçüncü kenarını giriniz: ");
        k3 = inp.nextDouble();

        cevre = k1 + k2 + k3;
        u = cevre/2;
        alan = u * (u - k1) * (u - k2) * (u - k3);

        System.out.println("Üçgenin çevresi : " + cevre);
        System.out.println("Üçgenin alanı : " +Math.sqrt(alan));

    }
}
