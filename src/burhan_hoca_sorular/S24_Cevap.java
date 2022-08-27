package burhan_hoca_sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S24_Cevap {
    public static void main(String[] args) {
        //Bir gün içinde alınan bir dizi sicaklik göstergelerini giriniz.
        // 100 girildiğinde veri girişi sonlandırılsın. Bu değerleri girdikten
        // sonra, günün en sıcak ve soğuk değerlerini ekrana yazdırınız.
        // (Eğer bu değerleri birisi bilgisayara kaydedecek olsaydı zaten bir
        // bakışta en yüksek ve en soğuk değerleri görürdü ve bu program gereksiz olurdu.
        // Fakat elektrikli termometre bir bilgisayara bağlı olabilir. Veya geçmiş yıllarda
        // veri kütüklerine kaydedilen kayıtları analiz ediyor olabiliriz. Bu durumda program
        // kullanımı daha mantıklı olur).
        Scanner scan=new Scanner(System.in);
        int sicaklik=0;
        List<Integer> sicaklikDeg=new ArrayList<>();
        int buyuk=0;
        int kucuk=0;
        while (sicaklik!=100){
            System.out.println("lütfen sicaklik değeri giriniz");
            sicaklik=scan.nextInt();
            if (sicaklik!=100){
                sicaklikDeg.add(sicaklik);
                if (sicaklik>buyuk){
                    buyuk=sicaklik;
                }else {
                    if (sicaklik<kucuk){
                        kucuk=sicaklik;
                    }
                }
            }
        }
        System.out.println(sicaklikDeg);
        System.out.println("buyuk = " + buyuk);
        System.out.println("kucuk = " + kucuk);
    }
}
