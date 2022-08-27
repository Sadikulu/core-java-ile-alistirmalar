package day10_Stringmanu;

import java.util.Scanner;

public class S08_Cevap {
    public static void main(String[] args) {
        //  Soru 6) Kullanicidan bir sifre girmesini isteyin.
        //  Asagidaki sartlari sagliyorsa
        //  "Sifre basari ile tanimlandi", sartlari saglamazsa
        //  "Islem basarisiz, Lutfen yeni bir sifre girin" yazdirin
        //  Ilk harf buyuk harf olmali
        //  Son harf kucuk harf olmali
        //  Sifre bosluk icermemeli
        //  Sifre uzunlugu en az 8 karakter olmali
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir şifre giriniz");
        String sifre= scan.nextLine();
        char ilkHarf=sifre.charAt(0);
        char sonHarf=sifre.charAt(sifre.length()-1);
        if ((ilkHarf>='A' && ilkHarf<='Z') && (sonHarf>='a' && sonHarf<='z') && (!sifre.contains(" ")) && (sifre.length()>=8)){
            System.out.println("Sifre basari ile tanimlandi");
        }else {
            System.out.println("Islem basarisiz, Lutfen yeni bir sifre girin");
        }

    }
}
