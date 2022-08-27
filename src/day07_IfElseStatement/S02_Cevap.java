package day07_IfElseStatement;

import java.util.Scanner;

public class S02_Cevap {
    public static void main(String[] args) {
        /*Kullanicidan gun isimlerinden birinin ilk harfini
        isteyin ve o harfle başlayan gun isimlerini yazdirin
        Örn:ilkHarf=P output = “Pazar, Pazartesi veya Perşembe"
        ilkHarf=S output = “Şali”
        Buyuk kucuk harf problem olmamasi için toUpperCase methodunu kullanin*/
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen günlerden birinin ilk harfini giriniz");
        char ilkHarf=scan.next().toUpperCase().charAt(0);
        if (ilkHarf=='P'){
            System.out.println("pazar, pazartesi, persembe");
        }
        if (ilkHarf=='S'){
            System.out.println("salı");
        }
        if (ilkHarf=='C'){
            System.out.println("carsamba, cuma, cumartesi");
        }
    }
}
