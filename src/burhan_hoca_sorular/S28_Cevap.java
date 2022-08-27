package burhan_hoca_sorular;

import java.util.Scanner;

public class S28_Cevap {
    public static void main(String[] args) {
       // Klavyeden okunan bir integer sayıyı basamak basamak ve
        // tersten ekrana yazdıran bilgisayar programını yazınız.
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen sayı giriniz");
        int sayi = scan.nextInt();
        int ters=0;
        for (int i = 0; i <10 ; i++) {
            ters*=10;
            ters+=sayi%10;
            sayi/=10;
            if (sayi==0){
                i=10;
            }

        }
        System.out.println(ters);
    }
}
