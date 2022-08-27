package alistirma;

import java.util.Scanner;

public class A15_Guzel {
    public static void main(String[] args) {
        //Kullanıcıdan istenen bir cümlede birden fazla tekrar eden harfleri bulalım ve yazdıralım
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cumle = scan.nextLine();
        for (char i = 'a'; i <= 'z'; i++) {
            int toplam = 0;
            for (int j = 0; j < cumle.length(); j++) {
                if (i == cumle.charAt(j)) {
                    toplam++;
                }
            }
            if (toplam>1){
                System.out.println(i+" "+toplam);
            }
        }
    }
}

