package burhan_hoca_sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S21_Cevap {
    public static void main(String[] args) {
        //Bir dizi sayı girerek ortalamalarını bulunuz. Girilen ilk sayı,
        // ortalaması alınacak sayıların adedini versin. Örneğin;
        //        Girilen veri :
        //        3
        //... (35 satır kaldı)
        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        int sira=1;
        List<Integer> sayilar=new ArrayList<>();
        while (sayi>=0) {
            System.out.println(sira+". sayıyı giriniz");
            sayi = scan.nextInt();
            if(sayi>=0) {
                sayilar.add(sayi);
            }
            sira++;
        }
        for (int i = 0; i <sayilar.get(0) ; i++) {
            toplam+=sayilar.get(i);
        }
        System.out.println(sayilar);
        int ort=toplam/sayilar.get(0);
        System.out.println("Ortalama : "+ort);


    }
}
