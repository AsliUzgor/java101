package TemelKavramlar;
import java.util.Scanner;
public class CalculatingBodyMassIndex {
    public static void main (String[] args){
        double boy, kilo, index;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz : ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu kilogram cinsinden giriniz : ");
        kilo = input.nextDouble();

        index = kilo / boy * boy;
        System.out.print("Vücut kitle indexsiniz : " + index);
    }
}
