package bhYeniSorular;

import java.util.Scanner;

public class S12_Cevap {
    public static void main(String[] args) {
        //12----
        //    Kullanıcının girdiği String değerlerini büyük
        //    harfe çeviren Java kodunu yazınız.

        //    Test Data:
        //    Java is fun

        //    Beklenen Sonuç:
        //    JAVA IS FUN
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cumle= scan.nextLine();
        String buyuk=cumle.toUpperCase();
        System.out.println("hepsi büyük : " + buyuk);

    }
}
