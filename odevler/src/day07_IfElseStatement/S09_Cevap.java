package day07_IfElseStatement;

import java.util.Scanner;

public class S09_Cevap {
    public static void main(String[] args) {
        /*Kullanicidan bir ucgenin uc kenar uzunlugunu alin
         eger uc kenar uzunlugu birbirine esit ise
         ekrana "Eskenar ucgen" yazdirin.
         Diger durumlarda ekrana Eskenar degil" yazdirin.*/
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen üçgenin kenaruzunluklarını giriniz");
        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();
        double kenar3=scan.nextDouble();
        if (kenar1==kenar2 && kenar3==kenar1) {
            System.out.println("eşkenar üçgendir");
        }else {
            System.out.println("eşkenar üçgen değildir");
        }

    }
}
