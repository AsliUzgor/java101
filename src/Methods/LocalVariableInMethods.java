package Methods;

public class LocalVariableInMethods {

    public static void main(String[] args){
        // değişkenler tanımlandıkları kod bloklarına aittir bunlara local değişkenler denir.
        int a = 10;

        if(a>20){
            int b = 20;
        }
      //  System.out.println(b); // b bu aralıkta tanımlı değil bu yüzden hata verdi local değişken
    }
}
