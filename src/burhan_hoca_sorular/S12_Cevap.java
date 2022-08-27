package burhan_hoca_sorular;

import java.util.Scanner;

public class S12_Cevap {
    public static void main(String[] args){
        //Klavyeden öğrencinin aldığı notu okuyan ve okunan bu nota göre
        // öğrencinin durumunu değerlendiren (Çok Güzel, Ortalamanın üzerinde,
        // Ortalamanın altında gibi) bilgisayar programını Java programlama dilinde yazınız.
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen not giriniz");
        int not = scan.nextInt();
        int ort=75;
        if (not<0 || not>100){
            System.out.println("geçersiz not");
        }else if (not>=85 && not<=100){
            System.out.println("Çok Güzel");
        }else if (not>=75 ) {
            System.out.println("Ortalamanın üzerinde");
        }else{
            System.out.println("Ortalamanın altında");
        }
    }
}
