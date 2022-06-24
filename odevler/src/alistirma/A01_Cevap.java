package alistirma;

import java.util.Scanner;

public class A01_Cevap {
    public static void main(String[] args) {
        //devamsizliktan dolayi kalan ogrenciler not yuzunden kalan ogrenciler ve her iki turlu kalan ogrenciler
        //kalma notu 50 alti
        //devamsizlik maksimum 30 gun olabilir gecmsei icin
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz");
        int note=scan.nextInt();
        System.out.println("lütfen devamsızlığınızı giriniz");
        int devam=scan.nextInt();
        if (note>50 && devam<30){
            System.out.println("tebrikler geçtiniz");
        }else {
            if (devam>=30){
                System.out.println("devamsızlıktan kaldınız");
            }else {
                System.out.println("başarısızlıktan kaldınız");
            }
        }
    }
}
