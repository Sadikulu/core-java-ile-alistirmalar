package burhan_hoca_sorular;

import java.util.Scanner;

public class S16_Cevap {
    public static void main(String[] args) {
        //Klavyeden okunan bir string ifadenin palindrome(tersten okununca da aynı)
        // olup olmadığını kontrol eden bilgisayar programını Java dilinde yazınız.
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cumle=scan.nextLine();
        String tersten="";
        for (int i = cumle.length()-1; i >=0 ; i--) {
            tersten+=cumle.substring(i,i+1);
        }
        System.out.println("tersten="+tersten);
        if (cumle.equals(tersten)){
            System.out.println("girilen cümle palindrome'dir");
        }else{
            System.out.println("girilen cümle palindrome değildir");
        }



    }
}
