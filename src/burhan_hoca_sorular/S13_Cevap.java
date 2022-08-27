package burhan_hoca_sorular;

import java.util.Scanner;

public class S13_Cevap {
    public static void main(String[] args) {
        //Klavyeden girilen herhangi bir yılın, gene klavyeden girilen herhangi
        // bir ayının kaç gün çektiğini hesaplayan bilgisayar programını Java programlama dilinde yazınız.
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir yıl giriniz");
        int yil = scan.nextInt();
        System.out.println("lütfen bir ay giriniz");
        int ay = scan.nextInt();
        switch (ay) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 gündür");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 gündür");
                break;
            case 2:
                if (yil % 4 == 0) {
                    if (yil % 100 == 0) {
                        System.out.println("28 gündür");
                    } else if (yil % 400 == 0) {
                        System.out.println("29 gündür");
                    }
                } else {
                    System.out.println("28 gündür");
                }
        }
    }
}
