package bhYeniSorular;

public class S26_Cevap {
    public static void main(String[] args) {
        //26-----
        //    Bir sayı asal olduğunda true, aksi halde false
        //    çıktısı return eden bir Java Methodu yazınız.

        //    Test Data:
        //    isPrime(31)
        //    true

        //    isPrime(18)
        //    false
        int sayi = 10;
        System.out.println(asal(sayi));


    }

    public static boolean asal(int sayi) {
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                return false;
            }else{

            }
        }
        return true;
    }
}
