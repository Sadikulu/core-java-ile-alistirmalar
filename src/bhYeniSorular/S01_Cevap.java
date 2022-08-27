package bhYeniSorular;

import java.util.Scanner;

public class S01_Cevap {
    public static void main(String[] args) {
        /*1---Sayının basamak değerlerinin toplamasını
        yapan Java kodu yazınız.
        Test Data
        34
        Beklenen Çıktı
        7*/
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int sayi= scan.nextInt();
        int basToplami=0;
        while (sayi%10!=0){
            basToplami+=sayi%10;
            sayi/=10;
        }
        System.out.println("basamak değerleri toplamı: "+basToplami);
    }
}
