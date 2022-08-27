package internet_Ornekler;

import java.util.Arrays;
import java.util.Scanner;

public class S06_Cevap {
    public static void main(String[] args) {
        /*
Örnek: Java’da dizideki bir öğeyi arama
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen arrayin uzunluğunu giriniz");
        int uzunluk=scan.nextInt();
        int sayilar[]=new int[uzunluk];
        System.out.println("aradığınız öğeyi giriniz");
        int aranan=scan.nextInt();
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(i+". indexi giriniz");
            sayilar[i]=scan.nextInt();
            if (aranan==sayilar[i]) {
                System.out.println(aranan+" arrayde var");
            }else{
                System.out.println(aranan+" arrayde yok");
            }
        }
        System.out.println(Arrays.toString(sayilar));
    }
}
