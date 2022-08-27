package day17_whileLoop;

import java.util.Scanner;

public class S07_Cevap {
    public static void main(String[] args) {
       //Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir tamsayı deperi giriniz");
        int sayi=scan.nextInt();
        int rakamlarToplamı=0;
        while (sayi!=0){
            rakamlarToplamı+=sayi%10;
            sayi/=10;
        }
        System.out.println("rakamlarToplamı = " + rakamlarToplamı);
    }
}
