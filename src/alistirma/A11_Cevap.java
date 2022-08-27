package alistirma;

public class A11_Cevap {
    public static void main(String[] args) {
        // verilen iki harf ve aralarındaki değerleri yazdırma
        char harf1='a';
        char harf2='d';
        for (char i = harf1; i <=harf2 ; i++) {
            System.out.print(i+",");
           //'a' yı almak istemezsek i=++harf1 deriz
        }
    }
}
