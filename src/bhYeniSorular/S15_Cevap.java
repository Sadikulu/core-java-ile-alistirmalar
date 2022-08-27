package bhYeniSorular;

import java.util.Scanner;

public class S15_Cevap {
    public static void main(String[] args) {
        //15----
        //    Grilen String değer içinde istenen sıradaki
        //    karakteri bulan Java kodunu yazınız.
        //    Test Data:
        //    Java is fun

        //    Beklenen Çıktı
        //    0. pozisyondaki karakter : J
        //    5. pozisyondaki karakter : i
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cumle = scan.nextLine();
        System.out.println("lütfen kaçıncı karakteri öğrenmek istediğiniz giriniz");
        int karakter= scan.nextInt();
        char istenenKarakter=cumle.charAt(karakter);
        System.out.println(karakter+". pozisyondaki karakter : " + istenenKarakter);
    }
}
