package TemelKavramlar;
import java.util.Scanner;
public class KdvCalculation {
    public static void main(String[] args){
        double tutar;
        double kdv1 = 0.18;
        double kdv2 = 0.08;
        System.out.print("Hesaplanmasını istediğiniz tutarı giriniz :");
        Scanner inp = new Scanner(System.in);
        tutar=inp.nextDouble();
        double kdvOran1 = tutar * kdv1;
        double kdvOran2 = tutar * kdv2;
        double kdvTutar1 = tutar + kdvOran1;
        double kdvTutar2 = tutar + kdvOran2;

        boolean str1 = tutar<1000;
        String str = (str1) ? "Kdv Oranı " + kdv1 + " Kdv li Tutar : " + kdvTutar1 : "Kdv Oranı : " + kdv2 + " Kdv li Tutar : " + kdvTutar2;
        System.out.println(str);
    }
}
