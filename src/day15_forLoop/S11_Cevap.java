package day15_forLoop;

import java.util.Scanner;

public class S11_Cevap {
    public static void main(String[] args) {
        /*Soru 11 ) Interview Question Kullanicidan 10'dan kucuk bir tamsayi isteyin ve girilen
        sayinin faktoryel'ini bulun. (5!=5*4*3*2*1)*/
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 10'dan küçük bir tam sayı giriniz");
        int sayi = scan.nextInt();
        if (sayi < 0 || sayi>10) {
            System.out.println("lütfen istenen aralıkta bir sayı giriniz");
        }else{
            int faktoriyel=1;
            for (int i = 1; i <=sayi ; i++) {
                faktoriyel*=i;
            }
            System.out.println("faktoriyel = " + faktoriyel);
        }
    }
}
