package alistirma;

import java.util.Scanner;

public class A03_Cevap {
    public static void main(String[] args) {
        // Kullanicidan dikdortgenin uzunlugunu ve genisligini alin,
        // girilen degerlere gore 	dikdorgenin kare olup olmadigini yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("dikdörtgenin kenar uzunluklarını giriniz");
        int kenar1=scan.nextInt();
        int kenar2=scan.nextInt();
        String sonuc=(kenar1>0 && kenar2>0)
                ?(kenar1==kenar2)?"karedir":"kare degildir":"gecerli bir deger giriniz";
        System.out.println("sonuc="+sonuc);
    }
}
