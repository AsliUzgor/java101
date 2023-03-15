package TemelKavramlar;
import java.util.Scanner;
public class HypotenuseCalculation {
    public static void main(String[] args){
        double k1, k2, hp;
        Scanner inp = new Scanner(System.in);

        System.out.print("Üçgenin birinci kenarını giriniz :");
        k1 = inp.nextDouble();
        System.out.print("Üçgenin ikinci kenarını giriniz :");
        k2 = inp.nextDouble();

        hp = (k1 * k1) + (k2 * k2);
        System.out.println("üçgenin hipotenüs değeri : " + Math.sqrt(hp));

    }
}
