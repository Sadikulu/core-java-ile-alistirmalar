package day09_switchcase;

import java.util.Scanner;

public class S02_Cevap {
    public static void main(String[] args) {
        /*Soru3 : Kullanicidan bir sayi girmesini isteyin
        Girilen sayi
        10 ise "Iki basamakli en kucuk sayi
        100 ise "uc basamakli en kucuk sayi"
        1000 ise "dort basamakli en kucuk sayi"
        diger durumlarda "Girdigin sayiyi degistir" yazdirin*/
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        int sayi = scan.nextInt();
        switch (sayi) {
            case 10:
                System.out.println("iki basamakli en küçük sayi");
                break;
            case 100:
                System.out.println("üç basamakli en küçük sayi");
                break;
            case 1000:
                System.out.println("dört basamakli en küçük sayi");
                break;
            default:
                System.out.println("girdigin sayiyi degistir");
        }
    }
}
