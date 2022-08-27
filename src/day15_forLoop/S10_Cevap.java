package day15_forLoop;

import java.util.Scanner;

public class S10_Cevap {
    public static void main(String[] args) {
        /*Soru 10 ) Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari
        toplayip, sonucu yazdiran bir program yaziniz*/
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen iki tam sayı giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int toplam=0;
        for (int i = sayi1; i <=sayi2 ; i++) {
            toplam+=i;
        }
        System.out.println("toplam = " + toplam);
    }
}
