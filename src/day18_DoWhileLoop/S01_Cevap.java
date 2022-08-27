package day18_DoWhileLoop;

public class S01_Cevap {
    public static void main(String[] args) {
        // 9 den 190 e kadar 7 nin kati olan tum tamsayilari ekrana yazdiriniz.
        int bas=9;
        int bitis=190;
        do {
            if (bas%7==0){
                System.out.print(bas+" ");
            }
            bas++;
        }while (bas<=bitis);
    }
}
