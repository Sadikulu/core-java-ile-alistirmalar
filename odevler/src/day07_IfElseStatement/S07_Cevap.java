package day07_IfElseStatement;

import java.util.Scanner;

public class S07_Cevap {
    public static void main(String[] args) {
        /*Kullanicidan bir karakter girmesini isteyin ve
        girilen karakterin harf olup olmadigini yazdirin*/
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char karekter=scan.next().charAt(0);
        if((karekter>='a' && karekter<='z') || (karekter>='A' && karekter<='Z')){
            System.out.println("girilen karekter harftir");
        }else {
            System.out.println("girilen karekter harf değildir");
        }

    }
}
