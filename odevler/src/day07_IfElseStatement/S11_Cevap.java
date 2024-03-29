package day07_IfElseStatement;

import java.util.Scanner;

public class S11_Cevap {
    public static void main(String[] args) {
        /*Kullanicidan iki sayi isteyin, sayilarin ikisi
         de pozitif ise sayilarin toplamini yazdirin,
         sayilarin ikisi de negative ise sayilarin
         carpimini yazdirin, sayilarin ikisi farkli
         isaretlere sahipse "farkli isaretlerde sayilarla
          islem yapamazsin" yazdirin sayilardan sifira
          esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen iki sayı giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        if (sayi1 > 0 && sayi2 > 0) {
            System.out.println("toplam= " + (sayi1 + sayi2));
        } else if ((sayi1 < 0 && sayi2 > 0) || (sayi1 > 0 && sayi2 < 0)) {
            System.out.println("farklı işaretlerde sayilarla işlem yapılmaz");
        } else if (sayi1 == 0 || sayi2 == 0) {
            System.out.println("sifir carpmaya göre yutan elemandir");
        }else{
            System.out.println("çarpım= " + sayi1 * sayi2);
        }
    }
}
