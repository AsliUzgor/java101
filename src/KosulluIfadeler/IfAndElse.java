package KosulluIfadeler;

public class IfAndElse {
    public static void main(String[] args){
        int a = 10, b = 20, c = 1;
        // iç içe if yazılabilir
        if(a < b){
            if(a < c){
                if (a == 10){
                    System.out.println("A sayısı 10 a eşittir. ");
                }
                System.out.print("A en küçük sayıdır. ");
            }else{
                System.out.println("A sayısı C sayısından büyüktür");
            }
        }
        // 3 sayıdan en kücüğünü bulma
        if((a < b) && (a < c)){
            System.out.println("A en küçük sayıdır ve A'nın değeri "+ a + " dır.");
        }else if ((b < a) && (b < c)){
            System.out.println("B en küçük sayıdır ve B'nin değeri " + b + " dir.");
        }else{
            System.out.println("C en küçük sayıdır ve C'nin değeri " + c + " dir.");
        }

        System.out.println("Program çalıştı ve bitti.");
    }
}
