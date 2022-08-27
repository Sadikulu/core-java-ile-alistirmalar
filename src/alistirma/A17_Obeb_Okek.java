package alistirma;

import java.util.Scanner;

public class A17_Obeb_Okek {
    public static void main(String[] args) {
        //girilen iki sayının obeb ve okekini bulunuz

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen iki tamsayı giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int obeb=0;
        if (sayi1<sayi2){
            for (int i = 1; i <=sayi1 ; i++) {
                if (sayi1%i==0 && sayi2%i==0){
                    obeb=i;
                }
            }
        }else{
            for (int i = 1; i <=sayi2 ; i++) {
                if (sayi1%i==0 && sayi2%i==0){
                    obeb=i;
                }
            }
        }
        System.out.println("obeb = " + obeb);
        System.out.println("okek = " + (sayi1*sayi2)/obeb);


    }
}
