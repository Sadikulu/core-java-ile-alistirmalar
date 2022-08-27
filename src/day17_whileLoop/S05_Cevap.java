package day17_whileLoop;

import java.util.Scanner;

public class S05_Cevap {
    public static void main(String[] args) {
        //Kullanicidan bir rakam alin ve bu rakam icin carpim tablosunu ekrana
        //yazdirin. Kullanicinin hata yapmadigini farz edin.
        //Ornegin kullanici 3 girerse;
        //3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir tamsayı deperi giriniz");
        int sayi=scan.nextInt();
        int bas=1;
        int bitis=10;
        while (bas<=bitis){
            System.out.print(sayi+"*"+bas+"="+(sayi*bas)+" ");
            bas++;
        }
    }
}
