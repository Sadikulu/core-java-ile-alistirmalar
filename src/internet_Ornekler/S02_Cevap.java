package internet_Ornekler;

import java.util.Arrays;
import java.util.Scanner;

public class S02_Cevap {
    public static void main(String[] args) {
        /*
Örnek: Java’da dizi öğelerini tersine çevirme
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("arrayin uzunluğunu giriniz");
        int uzunluk=scan.nextInt();
        int sayilar[]=new int[uzunluk];
        String tersten="";
        for (int i = 0 ; i <sayilar.length ; i++) {
            System.out.println(i+". indexi giriniz");
            sayilar[i]=scan.nextInt();
        }for (int j = sayilar.length-1 ; j >=0 ; j--) {
            tersten+=sayilar[j]+" ";
        }
        System.out.println(Arrays.toString(sayilar));
        System.out.println(tersten);
    }
}
