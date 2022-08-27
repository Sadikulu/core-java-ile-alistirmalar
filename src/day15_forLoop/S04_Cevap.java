package day15_forLoop;

import java.util.Scanner;

public class S04_Cevap {
    public static void main(String[] args) {
        /*Soru 4) Kullanicidan 100'den kucuk bir tamsayi
        isteyin. 1'den baslayarak girilen sayiya kadar 3'un
        kati olan sayilari yazdirin.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 100'den küçük bir sayı giriniz");
        int sayi = scan.nextInt();
        if (sayi >= 0 && sayi <= 100) {
            for (int i = 1; i <= sayi; i ++) {
                if (i%3==0) {
                    System.out.print(i + ",");
                }
            }
        }else{
            System.out.println("istenen aralıkta bir sayı giriniz");
        }
    }
}
