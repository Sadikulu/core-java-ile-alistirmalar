package day17_whileLoop;

public class S01_Cevap {
    public static void main(String[] args) {
      //While loop kullanarak 3 den 13 e kadar tum tek tamsayilari ekrana yazdiriniz.

        int sayi1=3;
        while (sayi1<=13){
            if (sayi1%2!=0){
                System.out.print(sayi1+" ");
            }
            sayi1++;
        }
    }
}
