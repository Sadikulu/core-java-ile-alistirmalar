package day18_DoWhileLoop;

import java.util.Scanner;

public class S04_Cevap {
    public static void main(String[] args) {
        //Soru 4) Kullanicidan toplamak uzere pozitif sayilar isteyin,
        // islemi bitirmek icin 0’a basmasini soyleyin.
        // Kullanici yanlislikla negative sayi girerse
        // o sayiyi dikkate almayin ve
        // “Negatif sayi giremezsiniz” yazdirip basa donun
        // Kullanici 0’a bastiginda toplam kac pozitif sayi
        // girdigini, yanlislikla kac negative sayi
        // girdigini ve girdigi pozitif sayilarin toplaminin
        // kac oldugunu yazdirin.
        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int negSayiAd=0;
        int pozSayiAd=0;
        int pozToplam=0;
        do {
            System.out.println("lütfen toplamak istediğiniz sayıları giriniz");
            sayi=scan.nextInt();
            if (sayi>0){
                pozToplam+=sayi;
                pozSayiAd++;
            } else if (sayi<0) {
                System.out.println("Negatif sayi giremezsiniz");
                negSayiAd++;
            }
        }while (sayi!=0);
        System.out.println(pozSayiAd+" adet pozitif sayi girdiniz ve toplamları : "+pozToplam);
        System.out.println(negSayiAd+" adet negatif sayi girdiniz");
    }
}
