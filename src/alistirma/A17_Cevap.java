package alistirma;

public class A17_Cevap {
    public static void main(String[] args) {
        //Soru 2: Verilen bir array’in tum elemanlarini toplayan bir program yazalim.
        int sayilar[]={1,2,3,4,5,};
        int toplam=0;
        for (int i = 0; i < sayilar.length ; i++) {
            toplam += sayilar[i];
        }
        System.out.println("tüm elemanlar toplamı : "+toplam);
    }
}
