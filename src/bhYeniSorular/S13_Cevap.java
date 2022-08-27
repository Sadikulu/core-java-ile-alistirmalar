package bhYeniSorular;

import java.util.Scanner;

public class S13_Cevap {
    public static void main(String[] args) {
        //13----
        //    Bir palindrom, madam veya racecar veya 10801
        //    sayısı gibi ileriye doğru geriye doğru okuyan
        //    bir kelime, sayı, kelime öbeği veya diğer
        //    karakter dizisidir.

        //    Girilecek kelimenin palindrom olup olmadığını
        //    doğrulayacak bir Java Kodu yazın.

        //    Test Data:
        //    madam

        //    Beklenen Çıktı:
        //    True
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cumle = scan.nextLine();
        String tersten = "";
        for (int i = cumle.length() - 1; i >= 0; i--) {
            tersten += cumle.substring(i, i + 1);
        }
        if (cumle.equals(tersten)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println("cumle = " + cumle);
        System.out.println("tersten = " + tersten);
    }
}
