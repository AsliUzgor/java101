package TemelKavramlar;

public class TemelOperatorler {
    public static void main(String[] args){
       int a = 10, b = 5, d=3;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        int c=a;
        System.out.println(c);

        d += b;
        System.out.println(d);

        boolean sonuc = (d!=b);
        System.out.println(sonuc);

        boolean kosul1 = a>b;
        boolean kosul2 = (c==d);
        boolean kosul3 = kosul1 && kosul2;
        System.out.println(kosul3);
    }
}
