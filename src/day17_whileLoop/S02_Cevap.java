package day17_whileLoop;

public class S02_Cevap {
    public static void main(String[] args) {
         //For loop ve while Loop kullanarak 3 basamakli sayilardan 15, 20 ve 90’na tam
        // bolunebilen sayilari yazdirin.

        int bas=100;
        int bitis=1000;
        int sayi=bas;
        /*for (int i =bas; i <bitis ; i++) {
            if (i%15==0){
                System.out.print(i+" ");
            } else if (i%20==0) {
                System.out.print(i+" ");
            } else if (i%90==0) {
                System.out.print(i+" ");
            }
        }*/
        while (sayi<bitis){
            if (sayi%15==0 && sayi%20==0 && sayi%90==0) {
                System.out.print(sayi+" ");
            }
            sayi++;
        }
    }
}
