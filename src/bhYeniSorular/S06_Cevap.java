package bhYeniSorular;

import java.util.Scanner;

public class S06_Cevap {
    public static void main(String[] args) {
        /*
         6----Kullanıcıdan bir harf girmesini isteyiniz.
         Girilen harf sesli ise Sesli harf olduğunu,
         değilse sessiz harf olduğunu ekrana yazdırsın.
         Girdiği değer harf değilse yada
         1 karakterden fazla ise hata mesajı göstersin.
         (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
    Sesli harfler: a,e,i,o,u
    Test Data:
    a
    Beklenen Çıktı:
    a harfi sesli harfdir.
    Test Data:
    d
    Beklenen Çıktı:
    d harfi sesiz harftir.
    Test Data:
    we  yada %
    Beklenen Çıktı:
    Yanlis karakter girdiniz!
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        String harf = scan.next();
        String sesliHarf = "a,e,i,o,u";
        if (sesliHarf.contains(harf)) {
            System.out.println(harf + " harfi sesli harftir");
        } else {
            if (!harf.replaceAll("\\w", "").equals("")) {
                System.out.println("Yanlis karakter girdiniz!");
            } else if (harf.length()>1) {
                System.out.println("Yanlis karakter girdiniz!");
            } else {
                System.out.println(harf + " harfi sessiz harftir");
            }
        }
    }
}
