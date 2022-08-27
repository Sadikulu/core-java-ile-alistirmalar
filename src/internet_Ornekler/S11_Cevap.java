package internet_Ornekler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class S11_Cevap {
    public static void main(String[] args) {
        /*
Öğrencilerin almış olduğu notların ortalaması hesaplayan bir ortalama methodu yazın. Notları dizi içerisinde tutup methoda diziyi gönderin.
         */
        Scanner scan=new Scanner(System.in);
        int not;
       // List<Integer> notlar=new ArrayList<>();
        int[] notlar=new int[8];
        for (int i = 0; i <notlar.length ; i++) {
            System.out.println((i+1)+". notu giriniz");
            not=scan.nextInt();
            notlar[i]=not;
        }
        int notlarToplam=0;
        for (int i = 0; i <notlar.length ; i++) {
            notlarToplam+=notlar[i];
        }
        int ortalama=notlarToplam/notlar.length;
        System.out.println(Arrays.toString(notlar));
        System.out.println("Notlar ortalaması : "+ortalama);
    }
}
