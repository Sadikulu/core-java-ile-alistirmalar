package bhYeniSorular;

import java.util.Scanner;

public class S14_Cevap {
    public static void main(String[] args) {
        //14----
        //    Girilen iki String veriyi karşılaştıran
        //    java kodu yazınız.

        //    Test data:
        //    1. String : techproed.com
        //    2. String : Techproed.com
        //    Beklenen Çıktı:
        //    False

        //    Test data:
        //    1. String : techproed.com
        //    2. String : techproed.com
        //    Beklenen Çıktı:
        //    true
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen karşılaştırılacak birinci cümleyi giriniz");
        String cumle1 = scan.nextLine();
        System.out.println("lütfen karşılaştırılacak ikinci kelimeyi giriniz");
        String cumle2 = scan.nextLine();
        if (cumle1.equals(cumle2)) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
