package day14_MethodCreation;

import java.util.Scanner;

public class S01_Cevap {
    public static void main(String[] args) {
        /*Soru 1) Kullanicidan bir sayi alin.
    Bu sayinin tek mi cift mi oldugunu,
    sifirdan buyuk mu kucuk mu oldugunu,
    ayrica ve 100'den buyukse birler, onlar ve yuzler
    basamagindaki rakamlarin toplamini,
    100'den kucukse sadece 1'ler basamagini yazdiran 3 methodolusturun.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        int sayi = scan.nextInt();
        tekCift(sayi);
        buyukKucuk(sayi);
        rakamKontrol(sayi);
    }

    public static void rakamKontrol(int sayi) {
        if (sayi >= 100) {
            int rakamlarToplami = sayi % 10;
            sayi /= 10;
            rakamlarToplami += sayi % 10;
            sayi /= 10;
            rakamlarToplami += sayi;
            System.out.println("girilen sayının rakamlar toplamı: " + rakamlarToplami);
        } else {
            System.out.println("sayının birler basamağı:" + (sayi % 10));
        }
    }


    public static void buyukKucuk(int sayi) {
        System.out.println(sayi < 0 ? "negatif" : sayi > 0
                ? "pozitif" : "negatif veya pozitif değil");
    }

    public static void tekCift(int sayi) {
        System.out.println(sayi % 2 == 0 ? "çift" : "tek");
    }
}

