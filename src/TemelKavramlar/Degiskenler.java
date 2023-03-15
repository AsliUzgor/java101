package TemelKavramlar;

public class Degiskenler {
    public static void main(String[] args){
        int number = 5; // 32 bit
        System.out.println(number);
        number = 10;
        System.out.println(number);
        int number1, number2=8, number3;
        System.out.println(number2);
        number3 = number + number2;
        System.out.println(number3);

        byte vByte = 100; //-128 ve 127
        System.out.println(vByte);

        short vShort = 1000; //32767 ve -32768 16 bit
        System.out.println(vShort);

        float vFloat = 5.2f; //32 bit
        System.out.println(vFloat);

        double vDouble = 15.26587; //64 bit
        System.out.println(vDouble);

    }

}
