package burhan_hoca_sorular;

import java.util.Scanner;

public class S26_Cevap {
    public static void main(String[] args) {
        //Klavyeden okuduğunuz bir string içindeki ‘a’ harflerini silerek
        // yeni stringi ekrana yazdıran programı yazınız?
        //Örnek Çalışım:
        //String Giriniz: abracadabra
        //Yeni Hali :brcdbr
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cumle = scan.nextLine();
        String asiz=cumle.replace("a","");
        System.out.println("A'sız cümle: "+asiz);

    }
}
