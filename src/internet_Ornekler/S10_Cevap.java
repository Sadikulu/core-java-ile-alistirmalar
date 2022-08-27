package internet_Ornekler;

import java.util.Arrays;

public class S10_Cevap {
    public static void main(String[] args) {
        /*
Örnek: Bir dizinin tüm öğelerini Java’daki başka bir diziye kopyalama
         */
        int[] sayilar={1,2,3,6,5,8,9,11,13};
        int[] yeniSayilar=new int[sayilar.length];
        for (int i = 0; i <sayilar.length ; i++) {
            yeniSayilar[i] += sayilar[i];
        }
        System.out.println(Arrays.toString(yeniSayilar));
    }
}
