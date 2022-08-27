package bhYeniSorular;

public class S09_Cevap {
    public static void main(String[] args) {
        /*
        9--) 2 farklı String'i  ucuca ekleyen Java Kodunu yazınız.
    Test Data:
    str1: Java is
    str2: fun
    Beklenen Çıktı:
    java is fun
         */
        String bitisik="";
        String str1="Java is";
        String str2="fun";
        bitisik= str1.concat(" ").concat(str2);
        System.out.println(bitisik);
    }
}
