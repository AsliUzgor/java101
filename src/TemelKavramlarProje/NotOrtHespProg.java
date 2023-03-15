package TemelKavramlar;
import java.util.Scanner;
public class NotOrtHespProg {
    public static void main(String[] args){
        int fzk, mat, turk, kmy, bio;
        Scanner input = new Scanner(System.in);

        System.out.print("Fizik ders notunuzu giriniz: ");
        fzk =input.nextInt();
        System.out.print("Matematik ders notunuzu giriniz: ");
        mat =input.nextInt();
        System.out.print("Türkçe ders notunuzu giriniz: " );
        turk =input.nextInt();
        System.out.print("Biyoloji ders notunuzu giriniz: " );
        bio =input.nextInt();
        System.out.print("Kimya ders notunuzu giriniz: " );
        kmy =input.nextInt();

        double ort = (mat+fzk+bio+kmy+turk)/5;
        System.out.println("Genel ortalamanız : " +ort);

        boolean sonuc = ort>59;
        String str = sonuc ? "Geçtiniz.." : "Kaldınız..";
        System.out.println(str);
    }
}
