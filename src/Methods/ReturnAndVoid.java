package Methods;

public class ReturnAndVoid {
    // return olmak zorunda ve return e ne verirsen onu döndürür
    static int sum1(int num1 , int num2){
        return num1 + num2;
    }

    // void methot geriye değer döndürmez işlem fonksiyon içerisinde yapılır
    static void sum2(int num1 , int num2){
        System.out.println(num1+num2);
    }
    public static void main(String[] args){
        System.out.println(sum1(5,2));
        sum2(6,9);
    }
}
