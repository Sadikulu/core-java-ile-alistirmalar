package day07_IfElseStatement;

import java.util.Scanner;

public class S04_Cevap {
    public static void main(String[] args) {
        /*Kullanicidan bir gun alin eger gun "Cuma" ise ekrana
         "Muslumanlar icin kutsal gun" yazdirin.
         "Cumartesi" ise ekrana "Yahudiler icin kutsal gun" yazdirin.
         "Pazar ise ekrana "Hiristiyanlar icin kutsal gun" yazdirin*/
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir gün giriniz");
        String girilenGun=scan.next();
        if (girilenGun.equals("cuma")){
            System.out.println("müslümanlar için kutsal gün");
        }
        if (girilenGun.equals("cumartesi")){
            System.out.println("yahudiler için kutsal gün");
        }
        if (girilenGun.equals("pazar")){
            System.out.println("hiristiyanlar için kutsal gün");
        }
        if (girilenGun.equals("pazartesi") || girilenGun.equals("salı")
                || girilenGun.equals("çarşamba") || girilenGun.equals("perşembe")){
            System.out.println("lütfen kutsal bir gün giriniz");
        }


    }
}
