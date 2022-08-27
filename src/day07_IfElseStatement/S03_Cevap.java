package day07_IfElseStatement;

import java.util.Scanner;

public class S03_Cevap {
    public static void main(String[] args) {
        /*Kullanicidan dikdortgenin kenar uzunluklarini
        isteyin ve dikdortgenin kare olup olmadigini yazdirin*/
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen dikdörtgenin kenarlarını aralarda entere basarak giriniz");
        double kısaKenar= scan.nextDouble();
        double uzunKenar= scan.nextDouble();
        if (kısaKenar==uzunKenar){
            System.out.println("dikdörtgen karedir");
        }
        if (!(kısaKenar==uzunKenar)){
            System.out.println("dikdörtgen kare değil, dikdörtgendir");
        }

    }
}
