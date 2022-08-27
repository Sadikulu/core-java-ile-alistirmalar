package day14_MethodCreation;

import java.util.Scanner;

public class S02_Cevap {
    public static void main(String[] args) {
       /*Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun.
         Kullanici 2,3 veya 4 degerini girerse,
         kullanicidan bu sayilari girmesini isteyin ve
         sayilarin toplamini yazdirin. Kullanici
         toplamak istedigi sayi adedini 4'den buyuk girerse
         "Cok sayi girdiniz, ben toplayamam" yazdirin.*/
        /*Scanner scan=new Scanner(System.in);
        System.out.println("lütfen kaç sayıyı toplamak istediğinizi yazınız");
        int adet= scan.nextInt();*/
        /*1. yol)
         if (adet>4){
            System.out.println("Cok sayi girdiniz, ben toplayamam");
        }else if (adet==4){
            dortSayiToplami();
        } else if (adet==3){
            ucSayıToplami();
        }else if (adet==2){
            ikiSayiToplami();
        }else{
            System.out.println("istenen adette sayı girmediniz");
        }*/
        /*2. yol)
         sayiToplami(adet);*/
        //3. yol)
        int sayi = sayiGir();
        
        if (sayi < 2) {
            System.out.println("2 den kucuk deger girdiniz");
        } else if (sayi > 4) {
            System.out.println("4 ten cok sayi girdiniz, ben toplayamam");
        } else {
            islem(sayi);
        }
    }
    public static int sayiGir() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi giriniz :");
        return scan.nextInt();
    }

    public static void islem(int sec) {
        int toplam = 0;
        switch (sec) {
            case 4:
                toplam += sayiGir();
            case 3:
                toplam += sayiGir();
            case 2:
                toplam += sayiGir();
                toplam += sayiGir();
                break;
        }
        System.out.println("toplam sonucu = " + toplam);
    }

    /*2. çözüm)
    public static void sayiToplami(int adet) {
        Scanner scan=new Scanner(System.in);
        if (adet>4){
            System.out.println("Cok sayi girdiniz, ben toplayamam");
        }else if (adet==4){
            System.out.println("lütfen dört sayı giriniz");
            int sayi1=scan.nextInt();
            int sayi2=scan.nextInt();
            int sayi3=scan.nextInt();
            int sayi4=scan.nextInt();
            System.out.println("Dört sayının toplamı: "+(sayi1+sayi2+sayi3+sayi4));
        } else if (adet==3){
            System.out.println("lütfen üç sayı giriniz");
            int sayi1=scan.nextInt();
            int sayi2=scan.nextInt();
            int sayi3=scan.nextInt();
            System.out.println("Üç sayının toplamı: "+(sayi1+sayi2+sayi3));
        }else if (adet==2){
            System.out.println("lütfen iki sayı giriniz");
            int sayi1=scan.nextInt();
            int sayi2=scan.nextInt();
            System.out.println("İki sayının toplamı: "+(sayi1+sayi2));
        }else{
            System.out.println("istenen adette sayı girmediniz");
        }
    }*/

    /*1. çözüm)
    public static void ikiSayiToplami() {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen iki sayı giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        System.out.println("İki sayının toplamı: "+(sayi1+sayi2));
    }

    public static void ucSayıToplami() {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen üç sayı giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        int sayi3=scan.nextInt();
        System.out.println("Üç sayının toplamı: "+(sayi1+sayi2+sayi3));
    }

    public static void dortSayiToplami() {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen dört sayı giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        int sayi3=scan.nextInt();
        int sayi4=scan.nextInt();
        System.out.println("Dört sayının toplamı: "+(sayi1+sayi2+sayi3+sayi4));

    }*/
}
