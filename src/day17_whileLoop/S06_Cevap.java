package day17_whileLoop;

import java.util.Scanner;

public class S06_Cevap {
    public static void main(String[] args) {
         //Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane
        //olduklarini ekranda yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir tamsayı değeri giriniz");
        int sayi=scan.nextInt();
        int toplam=0;
        int bölen=1;
        while (bölen<=sayi){
            if (sayi%bölen==0){
                System.out.print(bölen+" ");
                toplam+=bölen;
            }
            bölen++;
        }
        System.out.println("\n"+"Toplam : "+toplam);
    }
}
