package burhan_hoca_sorular;

import java.util.Scanner;

public class S06_Cevap {
    public static void main(String[] args) {
        //Klavyeden alınan integer tipli bir sayının asal olup olmadığını test eden Java programını yazınız
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir tamsayı giriniz");
        int sayi = scan.nextInt();
        for (int i = 2; i < sayi ; i++) {
            if (sayi%i!=0){
                System.out.println("sayı asal sayıdır");
                break;
            }else{
                System.out.println("sayı asal sayı değildir");
                break;
            }
        }

    }
}
