package internet_Ornekler;

import java.util.Scanner;

public class S03_Cevap {
    public static void main(String[] args) {
        /*
Örnek: Java’da bir dizideki en büyük sayıyı bulma
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("arrayin uzunluğunu giriniz");
        int uzunluk=scan.nextInt();
        int sayilar[]=new int[uzunluk];
        int enBuyuk=sayilar[0];
        for (int i = 0; i < sayilar.length ; i++) {
            System.out.println(i+". indexi giriniz");
            sayilar[i]=scan.nextInt();
            if(sayilar[i]>enBuyuk){
                enBuyuk=sayilar[i];
            }
        }
        System.out.println("en büyük sayı : "+enBuyuk);
    }
}
