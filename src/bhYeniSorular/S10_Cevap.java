package bhYeniSorular;

import java.util.Scanner;

public class S10_Cevap {
    public static void main(String[] args) {
        /*
        10-----Kullanıcıdan alınan String kümesi içerisinde
        aranan  String i bulan Java Kodunu yazınız.
    Test Data:
    Java is easy
    Aranan String: is
    Bektenen Çıktı:
    True
    Aranan String: and
    Beklenen Çıktı:False
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String cumle= scan.nextLine();
        System.out.println("lütfen cümlede kontrol etmek istediğiniz kelimeyi giriniz ");
        String arananKelime=scan.next();
        if (cumle.contains(arananKelime)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
