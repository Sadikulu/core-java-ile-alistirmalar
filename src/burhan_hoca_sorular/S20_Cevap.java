package burhan_hoca_sorular;

public class S20_Cevap {
    public static void main(String[] args) {
        //1’den 999’a kadar olan tüm tek tamsayıların toplamını bulunuz.
        int toplam=0;
        for (int i = 1; i <1000 ; i++) {
            if (i%2==1){
                toplam+=i;
                System.out.print(i+" ");
            }

        }
        System.out.println("Toplam : "+toplam);


    }
}
