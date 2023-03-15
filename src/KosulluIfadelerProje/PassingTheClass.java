package KosulluIfadelerProje;
import java.util.Scanner;
public class PassingTheClass {
    public static void main(String[] args){
        int  mathNote, physicsNote, musicNote, geographyNote;
        int avarage, total = 0 ;
        int lesson = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik ders notunuzu giriniz :");
        mathNote = inp.nextInt();

        System.out.print("Fizik ders notunuzu giriniz :");
        physicsNote = inp.nextInt();

        System.out.print("Müzik ders notunuzu giriniz :");
        musicNote = inp.nextInt();

        System.out.print("Coğrafya ders notunuzu giriniz :");
        geographyNote = inp.nextInt();

        if(mathNote >= 0 && mathNote<=100){
            total += mathNote;
        }
        lesson++;
        if (physicsNote >= 0 && physicsNote <=100) {
            total += physicsNote;
        }
        lesson++;
        if (geographyNote >= 0 && geographyNote <=100) {
            total += geographyNote;
        }
        lesson++;
        if (musicNote >= 0 && musicNote <=100) {
            total += musicNote;
        }
        lesson++;

        avarage = total / lesson;

        if(avarage < 50){
            System.out.println("Sınıfta kaldınız. Ortalamanız : " +avarage);
        }else{
            System.out.println("Tebrikler sınıfı geçtiniz. Ortalamanız : "+avarage);
        }
    }
}
