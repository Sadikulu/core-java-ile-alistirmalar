package day07_IfElseStatement;

import java.util.Scanner;

public class S06_Cevap {
    public static void main(String[] args) {
        /*Kullanicidan dikdortgenin kenar uzunluklarini
        isteyin ve dikdortgenin kare olup olmadigini yazdirin*/
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen dikdörtgenin kenar uzunluklarini giriniz");
        double kısaKenar=scan.nextDouble();
        double uzunKenar=scan.nextDouble();
        if (kısaKenar==uzunKenar) {
            System.out.println("karedir");
        }else {
            System.out.println("kare değil, dikdörtgendir");
        }
    }
}
