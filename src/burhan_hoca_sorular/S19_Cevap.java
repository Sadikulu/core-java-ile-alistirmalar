package burhan_hoca_sorular;

import java.util.Scanner;

public class S19_Cevap {
    public static void main(String[] args) {
        /*Girilen Satır Sayısına Göre Aşağıdaki çıktıyı verecek programı Java dilinde yazınız?
                Satir Sayisini Giriniz :
             5
                *
                **
                ***
                ****
                *****      */

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
