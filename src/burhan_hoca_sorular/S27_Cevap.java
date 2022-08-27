package burhan_hoca_sorular;

import java.util.Scanner;

public class S27_Cevap {
    public static void main(String[] args) {
        //Negatif bir sayı girilene kadar klavyeden girilen öğrenci notlarını
        // alarak bunların ortalamasını ekrana yazdıran bilgisayar programını yazınız?
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir not giriniz");
        int not = scan.nextInt();
        int toplam=0;
        int adet=0;
        for (int i = 0; i <1 ; i++) {
            adet++;
            toplam+=not;
            if (not>=0){
                System.out.println("lütfen bir not giriniz");
                 not = scan.nextInt();
                i--;
            }else{
                toplam-=not;
                adet--;
                System.out.println("negatif bir değer girdiniz");
            }

        }
        System.out.println("ortalama : "+(toplam/adet));
    }
}
