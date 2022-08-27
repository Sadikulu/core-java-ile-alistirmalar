package day14_MethodCreation;

import java.util.Scanner;

public class S04_Cevap {
    public static void main(String[] args) {
/*Soru 4) Kullanicidan ismini, soyismini ve bosluk
 birakmadan 16 hane olarak kredi karti numarasini alin.
 Isim ve soyismi ilk harfleri buyuk diger harfler kucuk
 olacak sekilde, KK numarasini ise 4 rakamlik 4 blok ve
 aralarinda bosluk olacak sekilde duzelten 2 method yazin,
 ve programda kullanabilmek icin duzenlenmis hallerini
geri dondurun.*/
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        String isim= scan.nextLine();
        System.out.println("lütfen soyisminizi giriniz");
        String soyisim=scan.nextLine();
        System.out.println("lütfen kredi kartı numaranızı giriniz");
        String kartNo=scan.nextLine();

        String ilkHarf=isimSoyisim(isim,soyisim);
        String krediNo=kkNumarası(kartNo);

        System.out.println(isimSoyisim(isim,soyisim)+"\n"+kkNumarası(kartNo));
    }

    public static String kkNumarası(String kartNo) {
        kartNo=kartNo.substring(0,4)+" "
                +kartNo.substring(4,8)+" "
                +kartNo.substring(8,12)+" "
                +kartNo.substring(12);
        return kartNo;
    }

    public static String isimSoyisim(String isim,String soyisim){
        isim=isim.substring(0,1).toUpperCase()
                +isim.substring(1).toLowerCase();
        soyisim=soyisim.substring(0,1).toUpperCase()
                +soyisim.substring(1).toLowerCase();
        return isim+" "+soyisim;
    }
}
