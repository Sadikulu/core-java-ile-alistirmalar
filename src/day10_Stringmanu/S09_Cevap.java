package day10_Stringmanu;

import java.util.Scanner;

public class S09_Cevap {
    public static void main(String[] args) {
        //  Soru 7) Kullanicidan ismini, soyismini ve
        //  kredi karti bilgisini isteyin
        //  ve asagidaki gibi yazdirin
        //  isim-soyisim : M***** *******
        //  kart no : **** *#** *#** 1234
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isiminizi giriniz");
        String isim= scan.nextLine();
        System.out.println("lütfen soyisiminizi giriniz");
        String soyIsim= scan.nextLine();
        System.out.println("lütfen kart numaranızı giriniz");
        String kartNumarasi= scan.nextLine();
        String isimIlkHarf=isim.substring(0,1).toUpperCase();
        String isimGerisi= isim.substring(1).replaceAll("\\w","*");
        soyIsim= soyIsim.replaceAll("\\w","*");
        kartNumarasi=kartNumarasi.substring(12);
        String knGerisi="**** *#** *#** ";
        System.out.println("isim-soyisim : "+isimIlkHarf+isimGerisi+" "+soyIsim+"\n"+"kart no : "+knGerisi+kartNumarasi);
    }
}
