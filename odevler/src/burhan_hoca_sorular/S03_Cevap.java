package burhan_hoca_sorular;

import java.util.Scanner;

public class S03_Cevap {
    public static void main(String[] args) {
        /*Klavyeden bir boy uzunluğu isteyiniz.
        175’e eşit veya küçükse ekrana ‘KISA BOYLUSUNUZ.’,
        175’den büyükse ekrana “UZUN BOYLUSUNUZ.’ mesajını
        yazdıracak şekilde programı yazınız.*/
        Scanner scan=new Scanner(System.in);
        System.out.print("lütfen bir boy uzunlgu giriniz");
        double boy=scan.nextDouble();
        if (boy<0 || boy>300){
            System.out.println("lütfen geçerli bir boy giriniz");

        }else if (boy>=175){
            System.out.println("uzun boylusunuz");
        }else {
            System.out.println("kisa boylusunuz");
        }


    }
}
