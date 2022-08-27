package day14_MethodCreation;

import java.util.Scanner;

public class S03_Cevap {
    public static void main(String[] args) {
        /*Soru 3) Email kontrolu yapan bir program yazin.
         Kullanicinin girdigi email @ isareti icermiyorsa
         "gecersiz email" yazdirin, @gmail.com icermiyorsa
         "lutfen gmail adresinizi girin" yazdirin, @gmail.com
         ile bitmiyorsa "Yazimda bir sorun var, maili kontrol ediniz"*/

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen emailinizi giriniz");
        String email= scan.nextLine();
        emailTanımlama(email);
    }

    public static void emailTanımlama(String email) {
        System.out.println(!email.contains("@")?"gecersiz email"
                :!email.contains("@gmail.com")?"lutfen gmail adresinizi girin"
                :!email.endsWith("@gmail.com")?"Yazimda bir sorun var, maili kontrol ediniz"
                :"email adresiniz başarı ile tanımlandı");
    }

    /*public static void emailTanımlama(String email) {
        if (!email.contains("@")){
            System.out.println("gecersiz email");
        } else if (!email.contains("@gmail.com")) {
            System.out.println("lutfen gmail adresinizi girin");
        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("Yazimda bir sorun var, maili kontrol ediniz");
        }else{
            System.out.println("email adresiniz başarı ile tanımlandı");
        }
    }*/
}
