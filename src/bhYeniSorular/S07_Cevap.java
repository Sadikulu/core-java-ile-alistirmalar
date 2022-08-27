package bhYeniSorular;

import java.util.Scanner;

public class S07_Cevap {
    public static void main(String[] args) {
        /*
        Ugly Number:
    Girilen bir sayının  ugly number olup olmadığını kontrol
    etmek için bir Java programı yazın.
    Sayı sisteminde,  ugly number  sadece asal faktörleri
    2, 3 veya 5 olan pozitif sayılardır.
    İlk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir.
    Kural olarak, 1 dahil.
    Test Data:
    13
    Beklenen çıktı:
    ugly number  degildir
    Test Data:
    25
    Beklenen Çıktı:
    ugly number
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int sayi= scan.nextInt();
        if (sayi % 2 == 0 || sayi % 3 == 0 || sayi % 5 == 0) {
            System.out.println(sayi + " ugly number");
        }else{
            System.out.println(sayi+" ugly number değildir");
        }
    }
}
