package burhan_hoca_sorular;

import java.util.Scanner;

public class S10_Cevap {
    public static void main(String[] args) {
        //Bir öğrenciye bir soru sorulsun ve öğrenciden cevap alınsın. Öğrencinin verdiği cevap
        // doğru değilse, bir defa daha sorunun sorulduğu durumun akış şemasını çiziniz ve Java programını yazınız.
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir soru sorunuz");
        String soru = scan.nextLine();
        System.out.println("lütfen bir cevap giriniz");
        String cevap = scan.nextLine();
        System.out.println("lütfen doğru cevabı giriniz");
        String doğruCevap=scan.nextLine();
        for (int i = 0; i <1 ; i++) {
            if (cevap.equals(doğruCevap)) {
                System.out.println("Aferin doğru cevap");
            } else {
                System.out.println("yanlış cevap tekrar cevap giriniz");
                i--;
                cevap = scan.nextLine();
            }
        }
    }
}
