package Methods;

public class RecursiveMethods {
    //bir fonksiyonun içerisinde tekrardan kendini çağırmasına recursive denir
    // genellikle geri dönüş olan fonksiyonlarda kullanılır
 /*   static void print(){
        System.out.println("Hello World!");
        print(); // çalışır ama bellekte yer kalmadığı için en son java hata verir
    }*/

    static int f(int n){
        if(n ==1){
            return 1;
        }

        return f(n-1) + n;
    }

    public static void main(String[] args){
       // print();

        //f(1) = 1
        //f(2) = f(1) + 2
        //f(3) = f(2) + 3
        //f(4) = f(3) + 4
        //f(n) = f(n-1) + n

        System.out.println(f(5));
    }
}