package Loops;

public class ContinueAndBreak {
    public static void main(String[] args){
        int i = 1;

        for(i = 1 ; i<= 10 ; i++){
            if(i == 3){
                continue;  // bu satırı atlayıp döngüye devam eder
            }
            if(i == 5){
                break; // bu satıra gelince döngüyü durdurur
            }
            System.out.println(i);
        }


        System.out.println("1 den 10 a kadar olan tek sayıları yazdırma");
        for(int k = 1; k <= 10 ; k++){
            if(k %2 == 0){
                continue;
            }
            System.out.println(k);
        }

    }
}
