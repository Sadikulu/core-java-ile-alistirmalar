package alistirma;

import java.util.Scanner;

public class A16_Tablo {
    public static void main(String[] args) {
        //Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore carpim
        //tablosu olusturun

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir pozitif bir rakam giriniz");
        int rakam = scan.nextInt();
        for (int i = 1; i <=rakam ; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.println(i+"*"+j+"="+i*j);

            }
            System.out.println("");
        }
    }
}
