package internet_Ornekler;

import java.util.Scanner;

public class S01_Cevap {
    public static void main(String[] args) {
        /*
         Java’da dizideki çift ve tek öğeler nasıl bulunur?
         Java dizideki çift ve tek öğelerin toplamını bulma
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen arrayin uzunluğunu giriniz");
        int uzunluk=scan.nextInt();
        int sayilar[] =new int[uzunluk];
       String ciftSayilar="";
       String tekSayilar="";
       int cifToplam=0;
       int tekToplam=0;
        for (int i = 0; i <sayilar.length ; i++) {
            System.out.println(i+ ". index değerini giriniz");
            sayilar[i] =scan.nextInt();
            if (sayilar[i]%2==0){
                ciftSayilar+=","+sayilar[i];
                cifToplam+=sayilar[i];
            }else{
                tekSayilar+=","+sayilar[i];
                tekToplam+=sayilar[i];
            }

        }
        System.out.println("çift sayılar : "+ciftSayilar);
        System.out.println("çift sayılar toplamı : "+cifToplam);
        System.out.println("tek sayılar : "+tekSayilar);
        System.out.println("tek sayılar toplamı : "+tekToplam);

    }
}
