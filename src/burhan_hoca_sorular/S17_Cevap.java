package burhan_hoca_sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S17_Cevap {
    public static void main(String[] args) {
        //        Klavyeden okunan bir string tanımlayıcının kurallara uygun
        //        olup olmadığını kontrol eden Java programını yazınız.
        //        Not: Bir tanımlayıcı harflerden, rakamlardan,
        //        alt çizgi karakterinden ( _ ) ve dolar ( $ ) işaretinden oluşur.
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cumle = scan.nextLine();
        List<String> kharfler = new ArrayList<>();
        List<Integer> rakamlar= new ArrayList<>();
        for (char i = 'a'; i <='z' ; i++) {
            kharfler.add(String.valueOf(i));
        }
        for (int i = 0; i <=9 ; i++) {
            rakamlar.add(i);
        }
        for (int i = 0; i <cumle.length() ; i++) {
            for (int j = 0; j <kharfler.size() ; j++) {
                if (cumle.contains(kharfler.get(j)) && cumle.charAt(i)==rakamlar.get(j) && cumle.contains("_") && cumle.contains("$")) {
                    System.out.println("String tanımlayıcı kurallara uygun");
                }else {
                    System.out.println("String tanımlayıcı kurallara uygun değil");
                }
            }

        }
    }
}
