package burhan_hoca_sorular;

import java.util.Scanner;

public class S22_Cevap {
    public static void main(String[] args) {
        //Bir işyerinde çalışan işçiler için, işçi adını, çalıştığı
        // saat ve saat ücretini giriniz. İsim olarak “SON” girilmesi veri
        // girişinin sonunu göstersin. Her işçinin ismini ve aldığı maaşı
        // hesaplayınız. Bütün işçilerin maaş hesaplaması bittikten sonra,
        // işçilere verilen toplam parayı ekrana yazdırınız.
        Scanner scan=new Scanner(System.in);
        String isim="";
        int saat=0;
        int ucret=0;
        int tumToplam=0;
        String bitis="SON";
         while (!isim.equalsIgnoreCase(bitis)) {
            System.out.println("lütfen işçi ismini giriniz");
            isim=scan.next();
                 if (isim.equalsIgnoreCase(bitis)){
                     isim="SON";
                 }else {
            System.out.println("işçinin kaç saat çalıştığını giriniz");
            saat=scan.nextInt();
            System.out.println("saatlik ücreti giriniz");
            ucret=scan.nextInt();
            int toplamUcret=ucret*saat;
            System.out.println(isim+"'in aldığı maaş : "+toplamUcret);
            tumToplam+=toplamUcret;
             }
        }
        System.out.println("işçilere verilen toplam ücret : "+tumToplam);
    }
}
