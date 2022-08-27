package sorular;

import java.util.Scanner;

public class S02_Cevap {
    public static void main(String[] args) {

        /*Kullanicidan bir websitesi girmesini isteyin
        kullanici eger basinda www. ve sonunda .com yoksa uyari verin
        eger sitesinin isminde codestars kullanirsa tesekkur mesaji ilet
        sitenin isminde bosluk varsa uyar*/
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir web sitesi ismini yazın");
        String web = scan.nextLine();
        if (web.startsWith("www") && web.endsWith(".com")) {
            if (web.contains("codestars") && !web.contains(" ")) {
                System.out.println("teşekkür ederiz");
            } else if (web.contains(" ")) {
                System.out.println("boşluk olmaz");
            }
        }else {
            System.out.println("giridiginiz isim hatalı");
        }

    }
}