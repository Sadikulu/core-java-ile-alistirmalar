package burhan_hoca_sorular;

public class S01_Cevap {
    public static void main(String[] args) {
        /*Bir malın fiyatı 1500ytl dir.
          Bu mal,%18 i kadar KDVsi alınarak satılacaktır.
          Bu malın KDV sini ve satılacağı fiyatı hesaplayıp
          ekrana yazdırınız.*/
        int fiyat=1500;
        double kdvTutarı=0.18;
        double kdvMiktari=fiyat*kdvTutarı;
        System.out.println("kdvMiktari = " + kdvMiktari);
        double kdvliFiyat=fiyat+kdvMiktari;
        System.out.println("kdvliFiyat = " + kdvliFiyat);

    }
}
