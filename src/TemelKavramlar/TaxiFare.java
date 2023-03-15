package TemelKavramlar;
import java.util.Scanner;
public class TaxiFare {
    public static void main(String[] args){
        double acilisUcreti = 10, kmOran = 2.20, toplamTutar, mesafe;
        Scanner inp = new Scanner(System.in);
        System.out.print("Gidilecek mesafeyi km olarak giriniz : ");
        mesafe = inp.nextDouble();
        toplamTutar = acilisUcreti + (kmOran*mesafe);
        boolean sonuc = (toplamTutar<20);
        String str = sonuc ? "Taksimetre ücreti : " +20 : "Taksimetre ücreti : " + toplamTutar;
        System.out.println(str);
    }
}
