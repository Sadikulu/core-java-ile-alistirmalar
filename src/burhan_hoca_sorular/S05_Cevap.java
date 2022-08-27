package burhan_hoca_sorular;

import java.util.Scanner;

public class S05_Cevap {
    public static void main(String[] args) {
        //soru 3-) Klavyeden okunacak bir e-mail adresindeki kullanıcı adını ve sunucu adını ekrana yazdıran bilgisayar programını Java dilinde yazınız.
         //       e-mail adresi örneği: turkaslan@gmail.com
         //       ekrana:
         //       kullaniciadi: turkaslan
         //       sunucu: gmail yazacak.
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen e mail adresinizi giriniz");
        String email = scan.nextLine();
        String kullaniciAdi=email.substring(0,email.lastIndexOf('@'));
        String sunucu=email.substring(email.lastIndexOf('@')+1);
        System.out.println("Kullanıcı adı : "+kullaniciAdi);
        System.out.println("Sunucu : "+sunucu);
    }
}
