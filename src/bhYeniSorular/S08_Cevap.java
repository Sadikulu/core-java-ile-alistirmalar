package bhYeniSorular;

import java.util.Scanner;

public class S08_Cevap {
    public static void main(String[] args) {
        /*
         8----
     Girilen String değerde tersten yazan Java kodunu yazınız.
    Test Data:
    java
    avaj
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String kelime= scan.next();
        String tersten="";
        for (int i = kelime.length()-1; i >=0; i--) {
            tersten=tersten.concat(kelime.substring(i,i+1));
        }
        System.out.println(tersten);
    }
}
