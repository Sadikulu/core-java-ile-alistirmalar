package day07_IfElseStatement;

import java.util.Scanner;

public class S05_Cevap {
    public static void main(String[] args) {
        /* Kullanicidan gun ismini alin ve haftaici veya
        hafta sonu oldugunu yazdirin
        Ornek: gun=Pazar output = "Hafta sonu"
                gun=Sali output = "Hafta ici"
         * String icin equals method'unu kullanin*/
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir gün ismi giriniz");
        String girilenGun = scan.next().toLowerCase();
        if (girilenGun.equals("pazar") || girilenGun.equals("cumartesi")) {
            System.out.println("haftasonu");
        }
        if (girilenGun.equals("pazartesi") || girilenGun.equals("sali")
                || girilenGun.equals("carsambar") || girilenGun.equals("persembe")
                || girilenGun.equals("cuma")) {
            System.out.println("hafta içi");
        }
        if (!(girilenGun.equals("pazartesi") || girilenGun.equals("sali")
                || girilenGun.equals("carsambar") || girilenGun.equals("persembe")
                || girilenGun.equals("cuma") || girilenGun.equals("cumartesi")
                || girilenGun.equals("pazar"))) {
            System.out.println("lütfen geçerli bir gun ismi giriniz");
        }
    }
}
