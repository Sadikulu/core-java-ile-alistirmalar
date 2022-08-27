package alistirma;

import java.util.Scanner;

public class A02_Cevap {
    public static void main(String[] args) {
        // Soru2 : Kullanicidan bir harf isteyin kucuk harf ise consola “Kucuk Harf” ,
        // buyuk harfse consola “Buyuk Harf” yoksa “girdiginiz karakter harf degil” yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        char harf=scan.next().charAt(0);
        String sonuc = ((harf>='a' && harf<='z') || (harf>='A' && harf<='Z'))
                ?(harf>='a' && harf>='z')?"küçük harf":"büyük harf":"girdiginiz karakter harf degil";
        System.out.println("sonuç: "+sonuc);

    }
}
