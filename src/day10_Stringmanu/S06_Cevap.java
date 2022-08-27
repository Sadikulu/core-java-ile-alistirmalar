package day10_Stringmanu;

import java.util.Scanner;

public class S06_Cevap {
    public static void main(String[] args) {
        // Soru 4) Kullanicidan isim ve soyismini
        // isteyin ve hangisinin daha uzun oldugunu yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isiminizi ve soyisminizi giriniz");
        String isim=scan.nextLine();
        String soyIsim=scan.nextLine();
        if (isim.length()>soyIsim.length()){
            System.out.println("isim daha uzun");
        }else{
            System.out.println("soyisim daha uzun");
        }
    }
}
