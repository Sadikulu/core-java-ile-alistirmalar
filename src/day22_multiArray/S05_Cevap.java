package day22_multiArray;

import java.util.Scanner;

public class S05_Cevap {
    public static void main(String[] args) {
        /*
         Soru 5) Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cumle=scan.nextLine();
        int toplam=0;
        for (int i = 0; i <cumle.length() ; i++) {
            if (cumle.charAt(i) == ' ') {
                toplam++;
            }
        }
        System.out.println("Kelime sayısı : "+(toplam+1));
    }
}
