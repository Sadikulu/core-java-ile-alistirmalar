package alistirma;

public class A12_Cevap {
    public static void main(String[] args) {
        //100'den 0'a kadar 13'e tam bölünebilen sayıları
        // ve toplamlarını ekrana yazdırınız (büyükten küçüğe).
        int toplam=0;
        for (int i =100; i >0 ; i--) {
            if (i%13==0){
                System.out.print(i+" ");
                toplam+=i;
            }
        }
        System.out.println("toplam = " + toplam);
    }
}
