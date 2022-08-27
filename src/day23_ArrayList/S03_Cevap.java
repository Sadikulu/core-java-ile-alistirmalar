package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S03_Cevap {
    public static void main(String[] args) {
        /*
          Soru 3) Kullanici Q'ya basincaya kadar girecegi isimleri
          alarak bir liste olusturup, bu
          isimleri bir list olarak bize donduren bir method olusturun
         */
        listeolustur();
    }

    public static void listeolustur() {
        Scanner scan=new Scanner(System.in);
        String isim="";
        List<String> isimler=new ArrayList<>();
        while (!isim.equals("Q")){
            System.out.println("lütfen isim giriniz");
            isim=scan.nextLine();
            if (!isim.equals("Q")){
                isimler.add(isim);
            }
        }
        System.out.println(isimler);
    }
}
