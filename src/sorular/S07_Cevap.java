package sorular;

import java.util.Scanner;

public class S07_Cevap {
    public static void main(String[] args) {
        /*
                2 sayı gir ve sayıları toplayıp sonucu ekrana yazdırınız
                karakter girerse "karakter girdiniz"
                string girerse "string girdiniz "
                özel karakter girerse "özel karakter girdiniz " yazısını ekrana çıkarsın
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi giriniz : ");
        String sayi1=scan.nextLine();
        System.out.println("Lutfen ikinci sayiyi giriniz : ");
        String sayi2=scan.nextLine();
        if(sayi2.equals(sayi2.replaceAll("\\D","")) && sayi1.equals(sayi1.replaceAll("\\D",""))){
            int sayi=Integer.parseInt(sayi1);
            int sayii=Integer.parseInt(sayi2);
            System.out.println("toplam = " + (sayi+sayii));
        }else{
            if (!(sayi1.equals(sayi1.replaceAll("\\w","")) || sayi2.equals(sayi2.replaceAll("\\w","")))){
                System.out.println("karakter girdiniz");
            } else if (!(sayi1.equals(sayi1.replaceAll("\\W","").replaceAll("\\d",""))
                    || sayi2.equals(sayi2.replaceAll("\\W","").replaceAll("\\d","")))) {
                System.out.println("String bir ifade girdiniz");
            }
        }
    }
}