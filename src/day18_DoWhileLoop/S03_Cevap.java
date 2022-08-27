package day18_DoWhileLoop;

import java.util.Scanner;

public class S03_Cevap {
    public static void main(String[] args) {
        //Soru 3) Kullanicidan toplamak uzere pozitif sayilar isteyin,
        // islemi bitirmek icin 0’a basmasini soyleyin. Kullanici 0’a
        // bastiginda toplam kac pozitif sayi girdigini ve girdigi pozitif
        // sayilarin toplaminin kac oldugunu yazdirin.
        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int pozToplam = 0;
        int pozAdedi = 0;
        do {
                System.out.println("lütfen toplamak için sayı giriniz");
                sayi = scan.nextInt();
                if (sayi>0){
                    pozToplam += sayi;
                    pozAdedi++;
                }else{
                    System.out.println("negatif sayı girme");
                }
        } while (sayi != 0);
        System.out.println(pozAdedi + " adet sayı girdiniz toplamı : " + pozToplam);
    }
}
