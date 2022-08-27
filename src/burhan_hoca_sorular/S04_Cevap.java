package burhan_hoca_sorular;

import java.util.Scanner;

public class S04_Cevap {
    public static void main(String[] args) {
        /*Klavyeden okunan bir karakterin (char) küçük harf
        olduğunun kontrolünü yaparak, bu harfin büyük harf
        karşılığını ekrana yazdıran programı Java dilinde yazınız.*/
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        char harf=scan.next().charAt(0);
        if( harf>='a' && harf<='z' ) {
            String yeniHarf=String.valueOf(harf);
            System.out.println("büyük harf: "+ yeniHarf.toUpperCase());
        }else{
            System.out.println("yeni bir karakter giriniz");
        }
    }
}
