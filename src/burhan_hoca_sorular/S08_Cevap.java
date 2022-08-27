package burhan_hoca_sorular;

import java.util.Scanner;

public class S08_Cevap {
    public static void main(String[] args) {
        //Ekrandan okunan 3 karakter verinin (String) en büyüğünü bularak ekrana
        // yazdıran bilgisayar programını Java programlama dilinde yazınız.
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen üç adet tamsayı giriniz");
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        String str3 = scan.nextLine();
        if (str1.length()>str2.length() && str1.length()>str3.length()){
            System.out.println("En büyük kelime: "+str1);
        } else if (str2.length()>str1.length() && str2.length()>str3.length()) {
            System.out.println("En büyük kelime: "+str2);
        }else{
            System.out.println("En büyük kelime: "+str3);
        }
    }
}
