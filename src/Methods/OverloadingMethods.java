package Methods;
public class OverloadingMethods {

    static void print(){
        System.out.println("Parametresiz fonksiyon");
    }

    static void print(int a){
        System.out.println("Int parametreli fonksiyon : " +a);
    }

    static void print(double a){
        System.out.println("Double parametreli fonksiyon : " +a);
    }

    public static void main(String[] args){
        print();
        print(7);
        print(9.0);
    }

}
