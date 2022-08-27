package burhan_hoca_sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S23_Cevap {
    public static void main(String[] args) {
        //Sınıftaki her öğrenci için isim ve notları giriniz.
        // Veri girişi “SON” isimli öğrenci ismi ile sonlandırılsın.
        // Her öğrenci için, isim ve harf notu çıkarınız. Bütün öğrenciler
        // işlendikten sonra, “not dağılımını çıkarınız”: A’ların adedi, B’lerin adedi, vb.
        Scanner scan = new Scanner(System.in);
        String isim = "";
        List<String> toplamNot = new ArrayList<>();
        //String toplamNot = "";
        int toplam = 1;
        do {
            System.out.println("lütfen öğrenci ismi giriniz");
            isim = scan.next();
            if (isim.equalsIgnoreCase("SON")) {
                isim = "SON";
            } else {
                System.out.println("lütfen öğrenci notu giriniz");
                String not = scan.next().toUpperCase();
                toplamNot.add(not);

            }
        } while (!isim.equalsIgnoreCase("SON"));
        List<String> notlist = new ArrayList<>();
        notlist.add("A");
        notlist.add("B");
        notlist.add("C");
        notlist.add("D");
        notlist.add("F");
        for (int i =0; i <notlist.size(); i++) {
            toplam = 0;
            for (int j = 0; j <toplamNot.size() ; j++) {
                if (notlist.get(i).equals(toplamNot.get(j))) {
                    toplam++;
                }
            }
            System.out.println(notlist.get(i) + "'ların adedi " + toplam);
        }
        System.out.println(toplamNot);
    }
}

