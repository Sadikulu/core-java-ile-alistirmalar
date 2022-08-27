package alistirma;

import java.util.Scanner;

public class A14_Cevap {
    public static void main(String[] args) {
        //kullanıcıdan alınan bir cümlede kaç adet 'b' harfi olduğunu bulalım
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cümle=scan.nextLine();
        int toplam=0;
        for (int i = 0; i <cümle.length() ; i++) {
            if ('b'==cümle.charAt(i)){
                toplam++;
            }
        }
        System.out.println("toplam = " + toplam);

        if (toplam==0){
                System.out.println("girilen cümlede 'b' harfi yoktur");
        }
    }
}
