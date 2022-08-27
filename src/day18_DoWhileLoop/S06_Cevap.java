package day18_DoWhileLoop;

import java.util.Scanner;

public class S06_Cevap {
    public static void main(String[] args) {
        //Kullanicidan toplamak icin sayi isteyin ve toplam
        // 500’e ulasincaya kadar devam istemeyi ettirin.
        // Toplam 500’e ulastiginda veya gectiginde toplami
        // ve kac sayi girildigini yazdirin
        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        int adet=0;
        do {
            System.out.println("lütfen toplamak istediğiniz sayıyı giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;
            adet++;
        }while (toplam<=500);
        System.out.println(adet+" adet sayı girdiniz toplamları : "+toplam);
    }
}
