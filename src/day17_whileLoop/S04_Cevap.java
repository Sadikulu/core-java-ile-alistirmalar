package day17_whileLoop;

import java.util.Scanner;

public class S04_Cevap {
    public static void main(String[] args) {
        // Kullanicidan baslangic ve bitis haflerini alin ve baslangic harfinden baslayip bitis
        //harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin. Kullanicinin hata
        //yapmadigini farz edin.
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen başlangıç ve bitiş değerlerini giriniz");
        char bas=scan.next().charAt(0);
        char bitis=scan.next().charAt(0);
        while (bas<=bitis){
            String yeni=String.valueOf(bas);
            System.out.print(yeni.toUpperCase()+" ");
            bas++;
        }


    }
}
