package internet_Ornekler;

import java.util.Arrays;

public class S07_Cevap {
    public static void main(String[] args) {
        /*
Örnek: Java’daki bir diziye öğe ekleme
         */
        int[] sayilar={5,3,4,6,9,10,25,12,15,8,7};
        int eklenecek=11;
        int[] yeniSayilar=new int[sayilar.length+1];
        for (int i = 0; i < sayilar.length ; i++) {
            yeniSayilar[i] += sayilar[i];
        }
        yeniSayilar[yeniSayilar.length-1] +=eklenecek;
        System.out.println("eklenmemiş sayılar array'i: "+Arrays.toString(sayilar));
        sayilar=yeniSayilar;
        System.out.println("eklenmiş sayılar array'i : "+Arrays.toString(sayilar));
    }
}
