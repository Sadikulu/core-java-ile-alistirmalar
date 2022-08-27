package day15_forLoop;

import java.util.Scanner;

public class S05_Cevap {
    public static void main(String[] args) {
        /*Soru 5) Kullanicidan 100'den kucuk bir tamsayi
        isteyin. 1'den baslayarak girilen sayiya kadar 3'un
        veya 5"in kati olan sayilari yazdirin.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 100'den küçük bir tam sayı giriniz");
        int sayi = scan.nextInt();
        if (sayi < 0 || sayi > 100) {
            System.out.println("lütfen geçerli aralıkta bir değer giriniz");
        } else {
            for (int i = 1; i <= sayi; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    System.out.print(i + ",");
                }
            }
        }
    }
}