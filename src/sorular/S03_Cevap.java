package sorular;

import java.util.Scanner;

public class S03_Cevap {
    public static void main(String[] args) {
        /*Kullanıcıdan ismini girmesini isteyin ve ismin ilk harfi büyük
        diğer harfleri küçük şekilde yazdırın. Eğer isim iki isimli ise kontrol edip ikisinide aynı sekilde yapsın*/
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        String isim=scan.nextLine();
        int bos=isim.indexOf(" ");
        if (isim.contains(" ")){
            isim=isim.substring(0,1).toUpperCase()+isim.substring(1,bos).toLowerCase()+isim.substring(bos,bos+2).toUpperCase()+isim.substring(bos+2).toLowerCase();
            System.out.println("isim = " +isim);

        }else {
           isim= isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
            System.out.println("isim = " + isim);
        }

    }
}
