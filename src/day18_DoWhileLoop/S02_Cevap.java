package day18_DoWhileLoop;

public class S02_Cevap {
    public static void main(String[] args) {
        //Soru 2 ) ’m’ harfinden baslayarak ‘c’ harfine kadar tum harfleri yazdirin.
        char bas='m';
        char bitis='c';
        do {
            System.out.print(bas+" ");
            bas--;
        }while (bas>=bitis);
    }
}
