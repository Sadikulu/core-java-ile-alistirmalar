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
        int ilkKelime=cümle.indexOf(kelime);
        int ikinciKelime=cümle.indexOf(kelime,(ilkKelime+1));
          if (ilkKelime==-1) {
            System.out.println("girilen kelime cümlede kullanilmamis");
        } else if (ikinciKelime!=0){
              System.out.println("Girilen kelime cumlede 1'den fazla kullanilmis");
        } else {
            System.out.println("Girilen kelime cumlede 1 kez kullanilmis");
        }

    }
}
