package day10_Stringmanu;

import java.util.Scanner;

public class S02_Cevap {
    public static void main(String[] args) {
        //Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki
        //kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin

        //- Girilen kelime cumlede kullanilmamis.
        //- Girilen kelime cumlede 1 kere kullanilmis
        //- Girilen kelime cumlede I'den fazla kullanilmis
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir cümle yazınız");
        String cümle = scan.nextLine().toLowerCase();
        System.out.println("lütfen bir kelime yazınız");
        String kelime = scan.next();
          if (cümle.indexOf(kelime) == -1) {
            System.out.println("girilen kelime cümlede kullanilmamis");
        } else if (cümle.indexOf(kelime) != (-1)) {
            System.out.println("girilen kelime cümlede 1 kere kullanılmış");
        } else {
            System.out.println("girilen kelime cümlede 1'den fazla kullanılmış");
        }

    }
}
