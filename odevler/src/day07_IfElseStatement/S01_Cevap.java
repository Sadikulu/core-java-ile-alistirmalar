package day07_IfElseStatement;

import java.util.Scanner;

public class S01_Cevap {
    public static void main(String[] args) {
        /*Soru 1) Kullanicidan bir tamsayi isteyin ve
        sayinin tek veya çift olduğunu yazdirin*/
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir tamsayi giriniz");
        int sayi=scan.nextInt();
        if (sayi%2==0){
            System.out.println("girilen sayi çifttir");
        }
        if (sayi%2!=0){
            System.out.println("girilen sayi tektir");
        }

    }

}
