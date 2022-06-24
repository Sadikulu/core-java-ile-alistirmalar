package day10_Stringmanu;

import java.util.Scanner;

public class S01_Cevap {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup
        //olmadigini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir cümle yaziniz");
        String cümle = scan.nextLine().toLowerCase();
        System.out.println("lütfen bir harf yaziniz");
        String harf=scan.next();
        /*if (cümle.indexOf(harf)==-1){
            System.out.println("girdiginiz harf cümlede kullanılmamıs");
        }else {
            System.out.println("girdiginiz harf cümlede kullanılmıs");
        }*/
        System.out.println(cümle.indexOf(harf));
    }
}
