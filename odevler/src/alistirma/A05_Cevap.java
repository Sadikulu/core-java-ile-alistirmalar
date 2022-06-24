package alistirma;

public class A05_Cevap {
    public static void main(String[] args) {
        int a=15;
        int b=12;
        int c=a<b?a:b;
        System.out.println("büyük olmayan: "+((a<b)?a:b));
        System.out.println("büyük olmayan: "+c);
    }
}
