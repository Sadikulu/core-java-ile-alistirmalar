package alistirma;

import java.util.Scanner;

public class S05_ArtikYil {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir yil giriniz");
        int yil = scan.nextInt();
        /*if (yil%100==0 ) {
            System.out.println("artik yil degildir");
        }else if (yil%400==0){
            System.out.println("artik yil");
        } else if (yil%4==0) {
            System.out.println("artik yil");
        }else{
            System.out.println("artik yil degildir");
        }*/
        if (yil%100==0) {
            if (yil%400==0) {
                System.out.println("artik yil");
            }else{
                System.out.println("artik yil degildir");
            }
        }else {
            if (yil%4==0) {
                System.out.println("artik yil");
            }else {
                System.out.println("artik yil degildir");
            }
        }
    }

}
