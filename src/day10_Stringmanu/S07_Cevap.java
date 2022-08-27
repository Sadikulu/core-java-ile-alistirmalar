package day10_Stringmanu;

import java.util.Scanner;

public class S07_Cevap {
    public static void main(String[] args) {
        // Soru 5) Kullanicidan 4 harfli bir kelime isteyin ve
        // girilen kelimeyi tersten yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 4 harfli bir kelime giriniz");
        String kelime=scan.next();
        String dHarf=kelime.substring(3);
        String üHarf=kelime.substring(2,3);
        String iHarf=kelime.substring(1,2);
        String bHarf=kelime.substring(0,1);
        System.out.println(dHarf+üHarf+iHarf+bHarf);
    }
}
