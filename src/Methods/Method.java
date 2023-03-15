package Methods;

public class Method {

    // üst alma
    static int Power(int base , int exp){
        int result = 1;
        for(int i = 1; i<=exp ; i++){
            result *= base;
        }
        return result;
    }

    //toplama
    static int Add(int num1 , int num2){
        return num1+num2;
    }

    public static void main(String[] args){
        System.out.println(Power(2,3));
        System.out.println(Add(78,14));
    }
}
