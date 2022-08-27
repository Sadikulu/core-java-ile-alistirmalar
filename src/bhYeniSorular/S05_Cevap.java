package bhYeniSorular;

public class S05_Cevap {
    public static void main(String[] args) {
        /*
         5-----Aşağıdaki elmas deseni görüntüsünü çizen
         java kodunu yazınız.
    Test Data:
    Yarım elmas uzunluğu : 7
    Beklenen Çıktı:
          *
         ***
        *****
       *******
      *********
     ***********
    *************
     ***********
      *********
       *******
        *****
         ***
          *
         */
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= (13 - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= (13 - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
