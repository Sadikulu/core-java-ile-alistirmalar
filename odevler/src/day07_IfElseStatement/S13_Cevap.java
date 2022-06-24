package day07_IfElseStatement;

import java.util.Scanner;

public class S13_Cevap {
    public static void main(String[] args) {
        /*Kullanicidan maas icin bir teklif isteyin ve
        asagidaki degerlere gore cevap azdirin.
        Teklif 80.000'in uzerinde ise "Kabul ediyorum",
        60 - 80.000 arasinda ise "Konusabiliriz",
        60.000'nin altinda ise "Maalesef Kabul edemem" yazdirin*/
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen maaş teklifinizi giriniz");
        long teklif = scan.nextLong();
        if (teklif < 60000) {
            System.out.println("malesef, kabul edemem");
        } else if (teklif < 80000) {
            System.out.println("konuşabiliriz");
        }else{
            System.out.println("kabul ediyorum");

        }


    }
}
