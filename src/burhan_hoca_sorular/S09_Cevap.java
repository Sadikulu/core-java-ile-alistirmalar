package burhan_hoca_sorular;

import java.util.Scanner;

public class S09_Cevap {
    public static void main(String[] args) {
        //Klavyeden okunan bir karakterin (char) küçük harf olduğunun kontrolünü yaparak,
        // bu harfin büyük harf karşılığını ekrana yazdıran programı Java dilinde yazınız.
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        char harf = scan.next().charAt(0);
        if (harf>='a' && harf<='z'){
           Character harf1=Character.toUpperCase(harf);
            System.out.println("büyük harf : "+harf1);
        }else{
            System.out.println("harf aynen : "+harf);
        }
    }
}
