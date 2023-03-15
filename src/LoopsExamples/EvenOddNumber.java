import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int number, sum = 0 ;
        System.out.print("Bir sayı giriniz :");
        number = inp.nextInt();
        for(int i = 0 ; i < number ; i++){
            if( i % 3 == 0 && i % 4 == 0 ){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
