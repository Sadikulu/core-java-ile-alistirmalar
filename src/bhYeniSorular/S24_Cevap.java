package bhYeniSorular;

public class S24_Cevap {
    public static void main(String[] args) {
        //24----
        //    Saati saniyeye çeviren java methodunu yazınız.

        //    Test Data:
        //    howManySeconds(2);
        //    Beklenen çıktı:
        //     7200
        int saat=2;
        saniye(saat);

    }

    public static void saniye(int saat) {
        int saniye=saat*60*60;
        System.out.println("saniye = " + saniye);
    }
}
