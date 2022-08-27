package internet_Ornekler;

import java.util.Arrays;
import java.util.Scanner;

public class S05_Cevap {
    public static void main(String[] args) {
        /*
Örnek: Java’daki dizide en büyük ve en küçük öğeyi bulma
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen arrayin uzunluğunu giriniz");
        int uzunluk = scan.nextInt();
        int sayilar[] = new int[uzunluk];
        int enBuyuk = sayilar[0];
        int enKucuk = sayilar[0];
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(i + ". indexi giriniz");
            sayilar[i] = scan.nextInt();
            if (sayilar[i] >= enBuyuk) {
                enBuyuk = sayilar[i];
            }
            if (enBuyuk>enKucuk && sayilar[i] < enKucuk) {
                enKucuk = sayilar[i];
            }
        }
        System.out.println(Arrays.toString(sayilar));
        System.out.println("enBuyuk = " + enBuyuk);
        System.out.println("enKucuk = " + enKucuk);
    }
}
