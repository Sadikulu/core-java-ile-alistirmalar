package bhYeniSorular;

import java.util.Arrays;

public class S20_Cevap {
    public static void main(String[] args) {
        //20----
        //    Karışık verilen sayıları  ve kelimeleri
        //    sıralayan   Java kodunun yazınız.
        //    not: Test datadaki değerleri kullanınız.

        //    Test Data:
        //    [1232, 1134,2345,1022]
        //    [Java, Python, PHP, C#, C Programming, C++]
        //    Beklenen Çıktı:
        //    [1022,1134,1232,2345]
        //    [C Programming, C#, C++, Java, PHP, Python]
        int[] sayilar={1232, 1134,2345,1022};
        String[] programs={"Java", "Python", "PHP", "C#", "C Programming", "C++"};
        Arrays.sort(sayilar);
        Arrays.sort(programs);
        System.out.println(Arrays.toString(sayilar));
        System.out.println(Arrays.toString(programs));

    }
}
