package TemelKavramlar;
import java.util.Scanner;
public class ShoppingCalculator {
    public static void main(String[] args){
        double pear = 2.14 , apple = 3.67 , tomato = 1.11 , banana = 0.95 , aubergine = 5.00 ;

        System.out.println("***** FIYAT LISTESI *****");
        System.out.println("***** Armut = 2.14 *****");
        System.out.println("***** Elma = 3.67 *****");
        System.out.println("***** Domates = 1.11 *****");
        System.out.println("***** Muz = 0.95 *****");
        System.out.println("***** Patlıcan = 5.00 ***** \n" );

        double pkg , akg , tkg , bkg , aukg , totalPrice;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç kilo armut almak istediğiniz giriniz :");
        pkg = inp.nextDouble();
        System.out.print("Kaç kilo elma almak istediğiniz giriniz :");
        akg = inp.nextDouble();
        System.out.print("Kaç kilo domates almak istediğiniz giriniz :");
        tkg = inp.nextDouble();
        System.out.print("Kaç kilo muz almak istediğiniz giriniz :");
        bkg = inp.nextDouble();
        System.out.print("Kaç kilo parlıcan almak istediğiniz giriniz :");
        aukg = inp.nextDouble();

        totalPrice = (pear * pkg) + (apple * akg) + (tomato * tkg) + (banana * bkg) + (aubergine * aukg);
        System.out.print("Ödenecek toplam fiyat : " + totalPrice);


    }
}
