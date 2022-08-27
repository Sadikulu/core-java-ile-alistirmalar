package alistirma;

import java.util.Scanner;

public class A04_Cevap {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin ve
        // sayi 3 basamakli pozitif sayi ise “uc basamakli sayi”, yoksa
        // “Uc 	basamakli degil” yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen üc bsamaklı sayiyi giriniz");
        int sayi=scan.nextInt();
        String sonuc=(sayi>=100 && sayi<=999) ? "uc basamakli sayi":"uc basamakli sayi degil";
        System.out.println("sonuc: "+ sonuc);
    }
}
