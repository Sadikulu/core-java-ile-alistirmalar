package alistirma;

import java.util.Scanner;

public class A07_Cevap {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen dikdörtgenin uzun ve kısa kenarlarını giriniz");
        int kısaKenar=scan.nextInt();
        int uzunKenar=scan.nextInt();
        System.out.println("sonuç= "+(kısaKenar==uzunKenar?"karedir" : "kare değildir"));
    }
}
