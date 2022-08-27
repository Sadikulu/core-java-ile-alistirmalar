package day15_forLoop;

import java.util.Scanner;

public class S07_Cevap {
    public static void main(String[] args) {
        /*Soru 7 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersten yazdirin.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String str = scan.nextLine();

        String ters=str.substring(str.length() - 1);
        for (int i = str.length() - 2 ; i >= 0; i--) {
            ters+=str.substring(i,i+1);
        }
        System.out.println("tersten = " +ters);
    }
}
