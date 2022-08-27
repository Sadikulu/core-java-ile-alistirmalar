package bhYeniSorular;

import java.util.Scanner;

public class S19_Cevap {
    public static void main(String[] args) {
        // 19----
        //    Kullanıcı tarafından girilen bir yılın  artık
        //    yıl olup olmadığını kontrol etmek için bir
        //    Java Methodu yazınız.

        //    Test Data:
        //    2017
        //    Beklenen Çıktı:
        //    false
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir yıl giriniz");
        int yil=scan.nextInt();
        artikYil(yil);

    }

    private static void artikYil(int yil) {
        if ((yil%4==0 || yil%400==0) && yil%100!=0){
            System.out.println(yil+" yılı artık yıldır");
        }else {
            System.out.println(yil+" yılı artık yıl değildir");
        }
    }
}
