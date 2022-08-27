package burhan_hoca_sorular;

import java.util.Scanner;

public class S15_Cevap {
    public static void main(String[] args) {
        //Kullanıcıdan (negatif bir sayı girinceye kadar) pozitif sayılar
        // alarak bu sayıların ortalamasını ekrana yazdıran bir program yazınız.
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen sayı giriniz");
        int sayi = scan.nextInt();
        int toplam=0;
        int adet=0;
        for (int i = 0; i <1000; i++) {
            toplam+=sayi;
            adet++;
            if (sayi<0){
                toplam-=sayi;
                adet--;
                System.out.println("negatif sayı girdin");
                break;
            }else{
                System.out.println("lütfen sayı giriniz");
                sayi = scan.nextInt();
            }
        }
        System.out.println("ortalama : "+(toplam/adet));
    }
}
