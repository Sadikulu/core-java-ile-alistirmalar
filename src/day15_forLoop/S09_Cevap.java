package day15_forLoop;

import java.util.Scanner;

public class S09_Cevap {
    public static void main(String[] args) {
        /*Soru 9 ) Interview Question Kullanicidan bir String isteyin. Kullanicinin girdigi String'in
        palindrome olup olmadigini kontrol eden bir program yazin.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String str = scan.nextLine();
        String tersten=str.substring(str.length()-1);
        for (int i =str.length()-2; i>= 0 ; i--) {
            tersten+=str.substring(i,i+1);
        }
        if (str.equals(tersten)){
            System.out.println("bu kelime palindrome'dur");
        }else{
            System.out.println("bu kelime palindrome değildir");
        }
        System.out.println("tersten = " + tersten);
    }
}
