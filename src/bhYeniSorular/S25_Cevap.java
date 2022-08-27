package bhYeniSorular;

public class S25_Cevap {
    public static void main(String[] args) {
        //25----
        //    İki integer sayının eşitliğini kontrol eden
        //    java methodunu yazınız.

        //    num1 = num2 => true
        int num1 =10;
        int num2 =20;
        esitlik(num1, num2);

    }

    public static void esitlik(int num1, int num2) {
        if (num1 ==num2) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
