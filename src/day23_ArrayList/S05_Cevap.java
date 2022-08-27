package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class S05_Cevap {
    public static void main(String[] args) {
        /*
          Soru 5) Verilen bir sayidan kucuk tum Fibonacci sayilarini
          bir liste olarak olusturup yazdirin
         */
        int sayi=10;
        int sayi1=0;
        int sayi2=1;
        int sayi3=0;
        List<Integer> fibo=new ArrayList<>();
        fibo.add(sayi1);
        fibo.add(sayi2);
        while (sayi3<sayi){
            sayi3=sayi1+sayi2;
            sayi1=sayi2;
            sayi2=sayi3;
            if (sayi3<sayi){
                fibo.add(sayi3);
            }
        }
        System.out.println(fibo);
    }
}
