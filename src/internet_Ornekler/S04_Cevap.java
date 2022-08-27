package internet_Ornekler;

import java.util.Arrays;
import java.util.Scanner;

public class S04_Cevap {
    public static void main(String[] args) {
        /*
Örnek: Java’daki bir dizide en büyük ikinci sayıyı bulma
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen arrayin uzunluğunu giriniz");
        int uzunluk=scan.nextInt();
        int sayilar[]=new int[uzunluk];
        int enBuyuk=sayilar[0];
        int enBuyuk2=sayilar[0];
        for (int i = 0; i < sayilar.length ; i++) {
            System.out.println(i+". indexi giriniz");
            sayilar[i]=scan.nextInt();
            if (sayilar[i]>=enBuyuk){
                enBuyuk=sayilar[i];
            }
            if (enBuyuk2<=sayilar[i] && sayilar[i]<enBuyuk ){
                enBuyuk2=sayilar[i];
            }
        }
        System.out.println(Arrays.toString(sayilar));
        System.out.println("enBuyuk2 = " + enBuyuk2);
    }
}
