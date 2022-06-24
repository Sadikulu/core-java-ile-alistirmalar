package burhan_hoca_sorular;

import java.util.Scanner;

public class Q01_Hesap {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen yapacaginiz islemi her değerden sonra entere basarak giriniz");
        double sayi1=scan.nextDouble();
        char islem=scan.next().charAt(0);
        double sayi2=scan.nextDouble();
        if (islem=='*') {
            System.out.println("sonuc= "+(sayi1*sayi2));
        }else if (islem=='+') {
            System.out.println("sonuc= "+(sayi1+sayi2));
        }else if (islem=='-') {
            System.out.println("sonuc= "+(sayi1-sayi2));
        }else if (islem=='/'){
            System.out.println("sonuc= "+(sayi1/sayi2));
        }
    }
}
