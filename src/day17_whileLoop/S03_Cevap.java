package day17_whileLoop;

import java.util.Scanner;

public class S03_Cevap {
    public static void main(String[] args) {
          //Kullanicidan baslangic ve bitis degerlerini alin. Baslangic degeri ve bitis degeri
          //dahil aradalarindaki tum cift tamsayilari while loop kullanarak ekrana yazdiriniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen başlangıç ve bitiş değerlerini giriniz");
        int bas=scan.nextInt();
        int bitis=scan.nextInt();
        while (bas<bitis){
            if (bas%2==0){
                System.out.print(bas+" ");
            }
            bas++;
        }
    }
}
