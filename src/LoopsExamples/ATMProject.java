package LoopsExamples;

import java.util.Scanner;

public class ATMProject {
    public static void main(String [] args){
        System.out.println(" ----------- MENÜ -----------");
        System.out.print("1) Para Çekme \n2) Para Yatırma \n3) Bakiye Sorgulama \n4) Çıkış \n");
        Scanner inp = new Scanner(System.in);
        int select , price , right = 3 ;
        int balance = 1500;

        String userName , password ;

        while(right >0){
            System.out.print("Kullanıcı Adı :");
            userName = inp.nextLine();
            System.out.print("Şifre: ");
            password = inp.nextLine();
            if(userName.equals("Admin") && password.equals("Ad1020*")){
                System.out.println("Sisteme başarılı bir şekilde giriş yapıldı.");

                System.out.println("Yapmak istediğiniz işlemi seçiniz : ");
                select = inp.nextInt();
                switch (select){
                    case 1:
                        System.out.println("Mevcut tutar : " +balance);
                        System.out.print("Yatırmak istediğiniz para tutarını giriniz :");
                        price = inp.nextInt();
                        balance += price;
                        System.out.print("Yeni tutar : " +balance);
                        break;
                    case 2:
                        System.out.print("Mevcut tutar : " +balance);
                        System.out.print("Çekmek istediğiniz para tutarını giriniz :");
                        price = inp.nextInt();
                        balance -= price;
                        System.out.print("Yeni tutar : " +balance);
                        break;
                    case 3:
                        System.out.print("Mevcut bakiye : " + balance);
                        break;
                    case 4:
                        System.out.print("Sistemden çıkış yapıldı.");
                        break;
                    default:
                        System.out.print("Hatalı seçim yaptınız");
                }
                break;
            }else{
                right-- ;
                System.out.println("Kullanıcı adı veya şifre hatalı. Tekrar deneyiniz.");
                System.out.println("Kalan hakkınız : " +right);
                if(right == 0){
                    System.out.println("3 kez hatalı kullanıcı adı veya şifre girdiniz. Bloke oldu.");
                }
            }
        }

    }
}
