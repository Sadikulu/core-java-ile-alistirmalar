package bhYeniSorular;

public class S17_Cevap {
    public static void main(String[] args) {
        // 17---
        //    Üç sayı arasındaki en küçük sayıyı bulmak için
        //    bir Java METHOD yazın.

        //    Test data:
        //    12,24,34
        //    Beklenen Çıktı:
        //    12
        int sayi1=12;
        int sayi2=24;
        int sayi3=34;
        enKucukSayi(sayi1, sayi2,sayi3);

    }

    private static void enKucukSayi(int sayi1, int sayi2, int sayi3) {
        if (sayi1>sayi2 && sayi1>sayi3) {
            System.out.println("en büyük sayi : "+sayi1);
        } else if (sayi2>sayi1 && sayi2>sayi3) {
            System.out.println("en büyük sayi : "+sayi2);
        }else {
            System.out.println("en büyük sayi : "+sayi3);
        }
    }
}
