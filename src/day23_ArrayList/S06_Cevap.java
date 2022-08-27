package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class S06_Cevap {
    public static void main(String[] args) {
        /*
          Soru 6) 1'den baslayarak istenen kadar Fibonacci
          sayisini bir liste olarak olusturup yazdirin.
         */
        int sayi=10;
        int sayi1=1;
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
