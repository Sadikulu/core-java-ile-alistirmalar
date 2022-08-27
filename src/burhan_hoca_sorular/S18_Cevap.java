package burhan_hoca_sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S18_Cevap {
    public static void main(String[] args) {
        //Ekrandan n tane satıcının isminin ve aylık satışlarının girildiğini
        // düşünelim. Satışları 10000 YTL’nin üzerindeki ödül alacak satıcının
        // ismini ekrana yazdıran Java programı yazınız.
        Scanner scan=new Scanner(System.in);
        String satıcıIsmi="";
        int satis=0;
        List<String> isim=new ArrayList<>();
        List<Integer> satislar=new ArrayList<>();
        int enBuyukSatis=0;
        while (satis<=10000){
            System.out.println("lütfen satıcı ismi giriniz");
            satıcıIsmi= scan.next();
            isim.add(satıcıIsmi);
            System.out.println("lütfen satış miktarını giriniz");
            satis=scan.nextInt();
            satislar.add(satis);
            for (int i = 0; i <satislar.size() ; i++) {
                if (satislar.get(i)>enBuyukSatis){
                    enBuyukSatis=satislar.get(i);
                }
            }
            if (satis>=10000){
                System.out.println(satıcıIsmi+"'nin satış miktarı : "+enBuyukSatis);
                satis=10001;
            }
        }
        System.out.println(isim);
        System.out.println(satislar);
    }
}
