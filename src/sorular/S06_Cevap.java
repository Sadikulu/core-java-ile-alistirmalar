package sorular;

import java.util.Scanner;

public class S06_Cevap {
    public static void main(String[] args) {
        /*Girilen stringin içindeki değerin başındaki ve sonundaki boslukları kaldırın
        string içinde boşluk hariç özel karakter veya sayi varsa uyari versin*/
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isim ve soyisminizi giriniz");
        String tamIsim= scan.nextLine();
        tamIsim=tamIsim.trim();
        tamIsim=tamIsim.replaceAll(" ","xr");
        if (tamIsim.equals(tamIsim.replaceAll("\\W","").replaceAll("\\d",""))){
            System.out.println("isim karakter ve sayı içermiyor");
        }else{
            System.out.println("isim karakter ve sayı içeriyor");
        }
        tamIsim=tamIsim.replaceAll("xr"," ");
        System.out.println("tamIsim = " + tamIsim);
    }
}
