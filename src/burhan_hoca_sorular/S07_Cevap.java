package burhan_hoca_sorular;

import java.util.Scanner;

public class S07_Cevap {
    public static void main(String[] args) {
        //Ekrandan okunan 3 sayısal verinin en büyüğünü bularak ekrana yazdıran
        // bilgisayar programını Java programlama dilinde yazınız.
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen üç adet tamsayı giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int sayi3 = scan.nextInt();
        if (sayi1>sayi2 && sayi1>sayi3){
            System.out.println("En büyük sayı: "+sayi1);
        } else if (sayi2>sayi1 && sayi2>sayi3) {
            System.out.println("En büyük sayı: "+sayi2);
        }else{
            System.out.println("En büyük sayı: "+sayi3);
        }
    }
}
