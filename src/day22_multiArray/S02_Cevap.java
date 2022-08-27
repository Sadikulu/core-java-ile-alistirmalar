package day22_multiArray;

public class S02_Cevap {
    public static void main(String[] args) {
        /*
         Soru 2) Asagidaki multi dimensional array’in ic array’lerindeki
         son elemanlarin carpimini
         ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6,3} }
         */
        int[][] sayilar={{1,2,3},{4,5},{6,3}};
        int carpim=1;
        for (int i = 0; i < sayilar.length ; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                if (j == sayilar[i].length - 1) {
                    carpim *= sayilar[i][j];
                }
            }
        }
        System.out.println("Son indexlerin çarpımı : "+carpim);
    }
}
