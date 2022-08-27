package bhYeniSorular;

import java.util.Scanner;

public class S11_Cevap {
    public static void main(String[] args) {
        /*
11----Kullanıcıdan alınan Stringin son
      karakteirini silip ekrana yazan Java kodunu yazınız.
      Test Data:
      good
      Beklenen Çıktı:
      goo
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cumle= scan.nextLine();
        String sonHarfsiz=cumle.replace(cumle.substring(cumle.length()-1), "");
        System.out.println("Son harfi silinmiş : "+sonHarfsiz);

    }
}
