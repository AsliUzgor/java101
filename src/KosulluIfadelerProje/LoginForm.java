package KosulluIfadelerProje;
import java.util.Scanner;
public class LoginForm {
    public static void main(String[] args){
        String userName, password, newPassword;
        int option;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz : ");
        userName = inp.nextLine();
        System.out.print("Şirenizi giriniz : ");
        password = inp.nextLine();

        if(userName.equals("Admin") && password.equals("Java101")){
            System.out.println("Başarılı bir şekilde giriş yaptınız ..");
        }else if(userName.equals("Admin") && !password.equals("Java101")){
            System.out.println("Şifrenizi yanlış girdiniz..");
            System.out.println("Şifrenizi sıfırlamak ister misiniz? \n 1) Evet \n 2) Hayır");
            option = inp.nextInt();

            switch (option){
                case 1:
                    System.out.print("Oluşturmak istediğiniz şifreyi giriniz : ");
                    newPassword = inp.nextLine();

                    if(newPassword.equals(password)){
                        System.out.print("Eski şifre ile aynı şifre oluşturulamaz.");
                    }else{
                        System.out.print("Yeni şifre oluşturuldu.");
                    }
                    break;
                case 2:
                    System.out.print("Yeni şifre oluşturulmadı.");
                    break;
                default:
                    System.out.print("Hatalı bir değer girdiniz ...");
            }
        }else{
            System.out.println("Kullanıcı bulunamadı..");
        }
    }
}
