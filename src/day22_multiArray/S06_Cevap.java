package day22_multiArray;

import java.util.Arrays;
import java.util.Scanner;

public class S06_Cevap {
    public static void main(String[] args) {
        /*
         Soru 6) Verilen bir Array’den istenen degere esit olan
         elamanlari kaldirip, kalanlari yeni bir
         Array olarak yazdiran bir method yaziniz
         */
        Scanner scan=new Scanner(System.in);
        int[] sayilar={1,5,6,4,1,3,8,9,5,6,3,8,7,9,1};
        System.out.println("lütfen silmek istediğiniz değeri giriniz");
        int sil=scan.nextInt();
        int silad=0;
        for (int i = 0; i < sayilar.length ; i++) {
            if (sil == sayilar[i]) {
                silad++;
            }
        }
        int[] yeniSayilar=new int[sayilar.length-silad];
        int yeniind=0;
        for (int i = 0; i < sayilar.length ; i++) {
                if (sil != sayilar[i]) {
                    yeniSayilar[yeniind] += sayilar[i];
                yeniind++;
            }
        }
        System.out.println(Arrays.toString(sayilar));
        System.out.println(Arrays.toString(yeniSayilar));

    }
}
